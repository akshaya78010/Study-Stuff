function fun1() {
  return new Promise(function (ressolved, rejected) {
    setTimeout(function () {
      ressolved(1);
    }, 1000);
  });
}

function fun2(value) {
  return new Promise(function (ressolved, rejected) {
    setTimeout(function () {
      ressolved(value + 1);
    }, 1000);
  });
}

function fun3(value) {
  return new Promise(function (ressolved, rejected) {
    setTimeout(function () {
      ressolved(value + 2);
    }, 1000);
  });
}

// fun1().then(function() {
//   console.log("function-1 completed");
//   fun2().then(function() {
//     console.log("function-2 completed");
//     fun3().then(function() {
//       console.log("function-3 completed");
//     });
//   });
// });

async function fun() {
  try {
    const res1 = await fun1();
    console.log(res1);
    const res2 = await fun2(res1);
    console.log(res2);
    const res3 = await fun3(res2);
    console.log(res3);
  } catch (err) {
    console.log(err);
  }
}

fun();
