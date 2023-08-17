import React from 'react';
import logo from './logo.svg';
import './App.css';
import Contributor from './Contributor';

function App() {

  const contributors = [
    {
      name: 'Florian Zinke',
      nickname: 'Flozi',
      twitterLink: 'https://twitter.com/flowzow',
      websiteLink: 'https://tilde.club/~flozi/',
      info: 'Hey there, my Name is Flozi, and im a Frontend Developer with a shitty Notebook :-)'
    }
  ]
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>
          List of contributers of this playground, just for fun!
        </h1>        
      </header>
      <div className="App-body">
        <ul>
          {
            contributors.map(contributor => (<li><Contributor {...contributor} /></li>))
          }
        </ul>
      </div>
    </div>
  );
}

export default App;
