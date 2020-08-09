### Callout System 
![Generic badge](https://img.shields.io/badge/project_language_level-java_8-green.svg?style=for-the-badge&logo=java)
[![Generic badge](https://img.shields.io/badge/Maintainer-braddevans-blue.svg?style=for-the-badge)](https://github.com/braddevans)

##
 
### CLI Arguments: 
 - `--mode=` - uses number from the user list e.g. `--mode=1` which is default
  
  
### User list
##### Note: all sql is passed as a prepared statement to stop sql injections e.g. `') drop table openTickets;--` 
```
    ID:[1], 
    name:[User], 
    hasAccessToDB:[false], 
    fxmlFile:[fxml/user.fxml], 
    width:[400], 
    height:[800], 
    WindowTitle:[Client Callout Window]
```
```
    ID:[2], 
    name:[Staff], 
    hasAccessToDB:[true], 
    fxmlFile:[fxml/staff.fxml],
    width:[1200],
    height:[800],
    WindowTitle:[Staff Callout Window]
```
```
    ID:[3],
    name:[Largeboard],
    hasAccessToDB:[false],
    fxmlFile:[fxml/board.fxml],
    width:[900],
    height:[800],
    WindowTitle:[Main Board]
```