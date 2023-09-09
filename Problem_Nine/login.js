let arrfromLS = JSON.parse(localStorage.getItem("signData")) || [];

document.querySelector("form").addEventListener("submit", myLogin);
function myLogin(event) {
  event.preventDefault();

  let loginObj = {
    loginEmail: document.querySelector("#link").value,
    loginPass: document.querySelector("#pass").value,
  };

  let flag = false;
  for (let i = 0; i < arrfromLS.length; i++) {
    if (
      arrfromLS[i].personEmail == loginObj.loginEmail &&
      arrfromLS[i].personPass == loginObj.loginPass
    ) {
      flag = true;
      break;
    }
  }
  if (flag == true) {
    alert("Login Successfull");
  } else {
    alert("Wrong Credentials");
    window.location.href = "index.html";
  }
}
