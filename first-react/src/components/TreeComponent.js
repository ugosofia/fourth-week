import React from "react";

export function A() {
    return (
        <div name= "A component">
            <B name="Ciao">
                <C name="ciao"></C>
            </B>
             </div>
    )
}

export function B(props) {
    return (
        <div name= {props.name}> {props.name} </div>
    )
}

export function C() {
    return (
        <div name= "C component"> </div>
    )
}