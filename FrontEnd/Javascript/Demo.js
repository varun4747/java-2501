'use strict';
// var a = 111;
// {
//     var a = 222;
//     console.log(a);  //var is used in global scope and also it will be changed when it is updated with another value
// }
// console.log(a);
//===============================================
// var a=10;
// {
// let b=20;
// console.log(a);  //Uncaught ReferenceError ReferenceError: b is not defined --because we called b in out of the method/block so it is not defined,so gets error--it is local scope within the method/block we will called.
// }
// console.log(b);
//===============================================
// var userName = 'kumar';
// var course = 'python';
// var fee = 10000;
// console.log(userName); int this scenario we dont get an  error because var is used in globally and we can use the same variable name in different methods/blocks.
// console.log(course);
// console.log(fee);


// var userName = 'Kumar', course = 'python', fee = 10000;
// console.log(userName);
// console.log(course);
// console.log(fee);

// let name = 'kumar',
//     course = 'python',
//     fee = 10000;
// console.log(name); //in this case we get an error because we use let keyword and the variable name is not same as the global variable name so we can not use the global variable name.
// console.log(course);
// console.log(fee);

var a= alert("Login succeeded");
var b=alert ( "User name and password is wrong")
console.log(a);
// No need to log b, as alert already displays the message to the user




