let signArr = JSON.parse(localStorage.getItem("signData")) || [];

document.querySelector("form").addEventListener("submit", mySign);
function mySign(event) {
  event.preventDefault();

  let signObj = {
    personNo: document.querySelector("#title").value,
    personEmail: document.querySelector("#link").value,
    personPass: document.querySelector("#pass").value,
  };

  // for condition if person already signed up is again signing up

  let flag = true;
  for (let i = 0; i < signArr.length; i++) {
    if (signArr[i].personEmail == signObj.personEmail) {
      flag = false;
      break;
    }
  }
  if (flag == true) {
    signArr.push(signObj);
    localStorage.setItem("signData", JSON.stringify(signArr));
    alert("Signed Up Successfully ---> Click on Sign In to login.");
  } else {
    alert("You are already signed Up. Please sign In");
  }
  window.location.href = "login.html";
}
