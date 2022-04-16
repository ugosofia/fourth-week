import './App.css';
import TastiComponent from './components/TastiComponent';
import Risultato from './components/Risultato';
import {Component} from 'react';




export default class App extends Component{

constructor() {
  super();

  this.state = {
    risultato : ""
  }



  function onClick( button ) {

    if(button === "="){
        this.calcola()
    }

    else if(button === "C"){
        this.reset()
    }

  }

  function calcola() {

  }

  function reset () {
    this.setState({
        risultato: ""
    })
}


  return (
    <div>
         <div className="calcolatrice">
              <Risultato risultato={this.state.risultato}/>
              <TastiComponent onClick={this.onClick}/>
        </div>
    </div>

  );

}
    

}