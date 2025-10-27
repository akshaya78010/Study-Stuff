var row = document.createElement("input");
var col = document.createElement("input");
var body_tag0 = document.getElementsByTagName("body")[0];

body_tag0.appendChild(row);
body_tag0.appendChild(col);


function fun1() {
  document.getElementsByClassName("box")[0].style =
    "transform : translateX(-10px);";
}

function fun2() {
  document.getElementsByClassName("box")[0].style =
    "transform : translateX(10px);";
}

function fun3() {
  document.getElementsByClassName("box")[0].style =
    "transform : translateY(-10px);";
}

function fun4() {
  document.getElementsByClassName("box")[0].style =
    "transform : translateY(10px);";
}

function fun() {
  var rows = document.getElementsByTagName("input")[0].value;
  var cols = document.getElementsByTagName("input")[1].value;

  let table = document.createElement("table");

  for (let i = 0; i < rows; i++) {
    let tr_tag = document.createElement("tr");
    for (let j = 0; j < cols; j++) {
      let td_tag = document.createElement("td");
      tr_tag.appendChild(td_tag);
    }
    table.appendChild(tr_tag);
  }

  body_tag0.appendChild(table);

  let button1 = document.createElement("button");
  let button2 = document.createElement("button");
  let button3 = document.createElement("button");
  let button4 = document.createElement("button");

  button1.innerText = "left";
  button2.innerText = "Right";
  button3.innerText = "top";
  button4.innerText = "down";
  body_tag0.appendChild(button1);
  body_tag0.appendChild(button2);
  body_tag0.appendChild(button3);
  body_tag0.appendChild(button4);
}
