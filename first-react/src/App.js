import logo from './logo.svg';
import './App.css';
import { Link } from './Link';

function App() {
  const obj = {
    name: 'Ugo',
    lastname: 'Sofia'
  }
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Link obj={obj}/>
      </header>
    </div>
  );
}

export default App;
