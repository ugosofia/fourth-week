import { UserItem, IUser } from "./user";

export class Model {
   
   items: Array<UserItem> = new Array();
   
    constructor() {
        this.items.push(
            new UserItem(1,'Ugo', "", "adf@sas.it", true ),
            new UserItem(2,'Ugo', "", "adf@sas.it", true ),
            new UserItem(3,'Ugo', "", "adf@sas.it", true ),
            new UserItem(4,'Ugo', "", "adf@sas.it", true )
        )
    }
}