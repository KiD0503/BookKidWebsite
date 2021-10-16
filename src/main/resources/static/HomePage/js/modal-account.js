    var divs = document.querySelectorAll(".pink");
    for (var i = 0; i < divs.length; i++) {
    divs[i].classList.add("el-comp-lt-pink");
}


<!-------------------------------------------- MODAL-Y THINGS ----------------------------------------->
    function sizechart_function(id) {
    var x = document.getElementById(id);
    if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
} else {
    x.className = x.className.replace(" w3-show", "");
}
}

    // Get the modal
    var modal = document.getElementById('id01');

    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
    if (event.target == modal) {
    modal.style.display = "none";
    body.style.overflow = "visible";
}
}

<!--------------------------------------- INSIDE THE MODAL -------------------------------------->
<!-- Measure Yourself and Product Measurment Buttons -->
    document.getElementsByClassName("tablink")[0].click();

    function openCity(evt, cityName) {
    var i, x, tablinks;
    x = document.getElementsByClassName("city");
    for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
}
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < x.length; i++) {
    tablinks[i].classList.remove("w3-light-grey");
}
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.classList.add("w3-light-grey");
}

<!-- Measure Yourself Inches and Centimeters Buttons -->

    document.getElementsByClassName("tablink-yourself")[0].click();

    function openCity_yourself(evt, cityName) {
    var i, x, tablinks_yourself;
    x = document.getElementsByClassName("city-yourself");
    for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
}
    tablinks_yourself = document.getElementsByClassName("tablink-yourself");
    for (i = 0; i < x.length; i++) {
    tablinks_yourself[i].classList.remove("w3-light-grey");
}
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.classList.add("w3-light-grey");
}

<!-- Product Inches and Centimeters Buttons -->
    document.getElementsByClassName("tablink-product")[0].click();

    function openCity_product(evt, cityName) {
    var i, x, tablinks_product;
    x = document.getElementsByClassName("city-product");
    for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
}
    tablinks_product = document.getElementsByClassName("tablink-product");
    for (i = 0; i < x.length; i++) {
    tablinks_product[i].classList.remove("w3-light-grey");
}
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.classList.add("w3-light-grey");
}
