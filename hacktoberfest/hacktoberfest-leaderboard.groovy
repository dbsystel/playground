#!/usr/bin/env groovy
import groovy.json.*
def members = new File('members.txt').text
entry = [:]
def template = """
      <entry>
        <avatar>
          <a href="https://github.com/${->entry.name}" class="hexlink">
          <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="100" height="100" xmlns:xlink="http://www.w3.org/1999/xlink">

            <defs>
               <pattern id="image-bg-${->entry.name}" x="0" y="0" height="100" width="100" patternUnits="userSpaceOnUse">
                 <image width="100" height="100" xlink:href="${->entry.userImage}"></image>
              </pattern>
            </defs>
            
            <polygon class="hex" points="100,50 75,93 25,93 0,50 25,6.6 75,6.6" fill="url('#image-bg-${->entry.name}')"></polygon>
          </svg>
          </a>
        </avatar>
        <name><a href="https://github.com/${->entry.name}">${->entry.name}</a></name>
        <prs>${->entry.prs}</prs>
      </entry>
"""
def board = []
members.eachLine { member ->
    if (member.trim()) {
        def pullRequests = new URL("https://hacktoberfestchecker.jenko.me/prs?username="+member).text
        pullRequests = new JsonSlurper().parseText(pullRequests)
        println "-"*80
        println member
        println pullRequests.userImage
        pullRequests.prs.each { pr ->
            println pr.repo_name
            println pr.created_at
        }
        board<<[name: member, prs:pullRequests.prs.size(), userImage: pullRequests.userImage]
    }
}
def html = ""
board.sort {it.prs}.reverse().each { currentEntry ->
    entry = currentEntry
    html += template
}
new File("build/.").mkdirs()
new File("build/leaderboard.html").write(
    new File("leaderboard.template").text.replaceAll("%content%",html)
    )
return 0