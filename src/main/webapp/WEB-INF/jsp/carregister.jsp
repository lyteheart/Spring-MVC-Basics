<html>
<body>

<h1>This is the signup page</h1>

<form action="/done" method="post">

    Car Number:
    <input type="text" name="registerationNumber">

    <br><br>

    Car Name:
    <select name="carName">
        <option value="KIA">KIA</option>
        <option value="BMW">BMW</option>
        <option value="Toyota">Toyota</option>
        <option value="Honda">Honda</option>
    </select>

    <br><br>

    Covered In Warranty:
    <input type="radio" name="carDetails" value="YES"> YES
    <input type="radio" name="carDetails" value="NO"> NO

    <br><br>

    Any Remarks:
    <input type="text" name="carWork">

    <br><br>

    <input type="submit" value="Register">

</form>

</body>
</html>