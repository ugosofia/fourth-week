import React from "react"


const PrintHello = ComposedComponent => class extends React.Component {
        onClick() {
            console.log('Hello world')
        }

        render() {
            return(
                <ComposedComponent {...this.props} onClick={this.onClick} />
            )
        }

}

const firstComponents = (props) => (
    <div onClick={props.onClick}>
        Hello, {props.name} I am a component
    </div>
)

export const SharedComponent =  HOC(firstComponents);