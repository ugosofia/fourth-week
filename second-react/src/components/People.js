import React from "react";



export class People extends React.Component {

    render () {
        return (
            <div className="button">
                <button type="button"
                    title="Clic per mostrare gli abitanti"
                    onClick={this.show}>Show
                  </button>
            </div>

        )
    }

    show() {
        return (<h3> 1.371.285</h3> )
      }
}