// REGISTER USER
function registerUser() {
    let name = document.getElementById("name").value;
    let password = document.getElementById("password").value;
    let msg = document.getElementById("message");

    if (name === "") {
        msg.textContent = "Please fill the name";
        return;
    }

    if (password === "") {
        msg.textContent = "Please fill the password";
        return;
    }

// Store values
    localStorage.setItem("username", name);
    localStorage.setItem("userpassword", password);

    msg.style.color = "green";
    msg.textContent = "Registered Successfully! Redirecting...";

    setTimeout(() => {
        window.location.href = "login.html";  // Go to login page
    }, 1000);
}

// LOGIN USER
function loginUser() {
    let loginName = document.getElementById("loginName").value;
    let loginPassword = document.getElementById("loginPassword").value;
    let loginMsg = document.getElementById("loginMsg");

    let storedName = localStorage.getItem("username");
    let storedPassword = localStorage.getItem("userpassword");

    if (loginName === "" || loginPassword === "") {
        loginMsg.textContent = "Please fill all the fields";
        return;
    }

    if (loginName === storedName && loginPassword === storedPassword) {
        loginMsg.style.color = "green";
        loginMsg.textContent = "Login Successful! Redirecting...";

        setTimeout(() => {
            window.location.href = "home.html";  // Go to home page
        }, 1000);

    } else {
        loginMsg.textContent = "Invalid name or password";
    }
}