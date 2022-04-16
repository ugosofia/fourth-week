import React, {useState} from "react";

export function Link (props) {
 
   
  const[counter, setCounter] = useState(0);
      return ( 
        <div>
          <div>{props.obj.name}{' '}{props.obj.lastname}</div>
          <p>Hai cliccato {counter} volte </p>
          <button onClick={() => setCounter( counter + 1)}>Increment</button>
         
           
        </div>
            )

    

}