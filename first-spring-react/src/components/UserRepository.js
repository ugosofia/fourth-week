import axios from "axios";
import React from "react";
import { useState } from "react";

export const UserRepository = () => {

const[users, setUsers] = useState([]);

React.useEffect(() => {
    const fetchData = async() => {
        const response  = await axios.get("http://localhost:8080/api/v1");
        setUsers(response.data);
    }
    fetchData();
}, []);

return(
    <div>
            {users.length > 0 && users.map(user =>
                <div>
                    <div key={user.id}>{user.id}</div>
                    <div key={user.name}>{user.name}</div>
                    <div key={user.lastName}>{user.lastName}</div>
                    <div key={user.age}>{user.age}</div>
                </div>
            )}
    </div>
)


            }