document.getElementById('singup-form').addEventListener('submit', function (e) {
    e.preventDefault();

    let isValid = true;

    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirm-password').value;
    const errorMessage = document.getElementById('error-message');

    errorMessage.forEach(error => error.textContent = '');

    if (username.value.trim() === '') {
        showError(username, 'Tên đăng nhập không được để trống');
        isValid = false;
    }

    if (email.value.trim() === '') {
        showError(email, 'Email không được để trống');
        isValid = false;
    }
    else if (!ValidityState.email(email.value)) {
            showError(email, 'Email không hợp lệ');
            isValid = false;
        }

        if (password.value.trim() === '') {
            showError(password, 'Mật khẩu không được để trống');
            isValid = false;
        }else if (password.value.length < 6) {
            showError(password, 'Mật khẩu phải có ít nhất 6 ký tự');
            isValid = false;
        }
        if (confirmPassword.trim() === '') {
            showError(document.getElementById('confirm-password'), 'Xác nhận mật khẩu không được để trống');
            isValid = false;
        } else if (confirmPassword !== password) {
            showError(document.getElementById('confirm-password'), 'Mật khẩu xác nhận không khớp');
            isValid = false;
        }        
        if (isValid) {
            alert('Đăng ký thành công!');
            // Gửi dữ liệu đến server hoặc thực hiện hành động khác ở đây
        }
    });

function showError(input, message) {
    const errorMessage = input.nextElementSibling;
    errorMessage.textContent = message;
    input.classList.add('error');
}

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}

function validatePassword(password) {
    const re = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{6,}$/;
    return re.test(String(password));
}

function validateConfirmPassword(password, confirmPassword) {
    return password === confirmPassword;
}

function validateForm() {
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirm-password').value;

    let isValid = true;

    if (username === '') {
        showError(username, 'Tên đăng nhập không được để trống');
        isValid = false;
    }

    if (email === '') {
        showError(email, 'Email không được để trống');
        isValid = false;
    } else if (!validateEmail(email)) {
        showError(email, 'Email không hợp lệ');
        isValid = false;
    }

    if (password === '') {
        showError(password, 'Mật khẩu không được để trống');
        isValid = false;
    } else if (!validatePassword(password)) {
        showError(password, 'Mật khẩu phải có ít nhất 6 ký tự và chứa chữ hoa, chữ thường và số');
        isValid = false;
    }

    if (confirmPassword === '') {
        showError(confirmPassword, 'Xác nhận mật khẩu không được để trống');
        isValid = false;
    } else if (!validateConfirmPassword(password, confirmPassword)) {
        showError(confirmPassword, 'Mật khẩu xác nhận không khớp');
        isValid = false;
    }

    return isValid;
}
function showError(input, message) {
    const errorMessage = input.nextElementSibling;
    errorMessage.textContent = message;
    input.classList.add('error');
}
function clearError(input) {
    const errorMessage = input.nextElementSibling;
    errorMessage.textContent = '';
    input.classList.remove('error');
}

