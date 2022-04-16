import React from "react";
import { Component } from "react";


class Risultato extends React.Component {
    
    render() {
        let {risultato} = this.props;
        return (
            <div className="result">
                <p>{risultato}</p>
            </div>
    
        );
        }

}


export default Risultato;