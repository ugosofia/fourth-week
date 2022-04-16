import React, {Component} from 'react';

class TastiComponent extends Component {

    render() {
        return (
            <div className="button">
                <button name="(" onClick={ t => this.props.onClick(t.target.name)}>(</button>
                <button name="CE" onClick={t => this.props.onClick(t.target.name)}>CE</button>
                <button name=")" onClick={t => this.props.onClick(t.target.name)}>)</button>
                <button name="C" onClick={t => this.props.onClick(t.target.name)}>C</button><br/>
                <button name="1" onClick={t => this.props.onClick(t.target.name)}>1</button>
                <button name="2" onClick={t => this.props.onClick(t.target.name)}>2</button>
                <button name="3" onClick={t => this.props.onClick(t.target.name)}>3</button>
                <button name="+" onClick={t => this.props.onClick(t.target.name)}>+</button><br/>
                <button name="4" onClick={t => this.props.onClick(t.target.name)}>4</button>
                <button name="5" onClick={t => this.props.onClick(t.target.name)}>5</button>
                <button name="6" onClick={t => this.props.onClick(t.target.name)}>6</button>
                <button name="-" onClick={t => this.props.onClick(t.target.name)}>-</button><br/>
                <button name="7" onClick={t => this.props.onClick(t.target.name)}>7</button>
                <button name="8" onClick={t => this.props.onClick(t.target.name)}>8</button>
                <button name="9" onClick={t => this.props.onClick(t.target.name)}>9</button>
                <button name="*" onClick={t => this.props.onClick(t.target.name)}>x</button><br/>
                <button name="." onClick={t => this.props.onClick(t.target.name)}>.</button>
                <button name="0" onClick={t => this.props.onClick(t.target.name)}>0</button>
                <button name="=" onClick={t => this.props.onClick(t.target.name)}>=</button>
                <button name="/" onClick={t => this.props.onClick(t.target.name)}>÷</button><br/>
            </div>
        );
    }
}


export default TastiComponent;
