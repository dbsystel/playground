<!--
SPDX-FileCopyrightText: 2022 DB Systel GmbH

SPDX-License-Identifier: Apache-2.0
-->

# Contribution guidelines

We are happy that you are here. Contributions are welcome.

It's important to us that we have a welcoming and respectful enviroment for everybody here. Be kind.

By submitting a contribution to this repository you agree that you do this under the license of the repository and certify that you have all the rights to do so.

Note that this is a public repository. It's meant as a learning environment, not as a place to host valuable code. Don't commit anything which is not meant to be public or should rather be somewhere else.

## Workflow for creating pull requests

To create a pull request follow a simple workflow (this is the [standard GitHub flow](https://help.github.com/en/articles/github-flow)):

1. Fork this repo

   Click the fork button on the repo. GitHub will create a repository fork in your personal space on GitHub.

2. Clone the repo

   Create a local copy of the repo by doing something like `git clone git@github.com:<yourname>/playground`. The GitHub UI has more detailed instructions.

3. Create a branch

   It's best to work on a branch when doing changes for a pull request. Create one by doing something like `git checkout -b fancy-feature`, where `fancy-feature` is the name of your local branch. Choose whatever name you feel is suitable.

4. Do your changes on the branch

   Add and change the files necessary to do your change. Test that it works and commit them to your local branch, e.g. by doing `git add .` and `git commit`. Write a meaningful commit message. A great guideline for this is ["How to write a Git Commit Message"](https://chris.beams.io/posts/git-commit/).

5. Push changes to your fork on GitHub

   `git push` will send your local changes to your repo fork on GitHub.

6. Open a pull request in the GitHub UI

   `git push` will show you an URL which will directly lead you to the page where you can create your pull request. Or you go to your fork in your web browser and there will be a notice that you have pushed code which can be submitted as pull request with a button to do so.

7. Review time

   The maintainer will review the changes and comment on them in the pull request. Maybe there will be suggestions for changes how to improve the pull request. Take part in the discussion. Remember that this is review of the code and not the person committing the code. When everything is fine, the maintainer will merge the pull request. Congratulations, your contribution has been accepted. You can delete your branch then.
