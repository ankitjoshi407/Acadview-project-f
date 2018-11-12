<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login to your swiggy account</title>
<style>
a {
color:DarkOrange;

}
p{
	color:red;
}
body
{
	background-image:url("bgh.jpg");
	 height: 100%; 

 
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}


</style>
</head>
<body >
<center>

<br><br><br><br><p><h1>LOGIN</h1></p>
<p >or
<a href="signup.jsp">Create an account</a>
</center>
</body><br>
<center>
<form action="/action_page.php">

<input type="number"  style="width:250px;height:50px;color:#E9967A" placeholder="Phone Number"  maxlength="10" required><br>
<input type="password"  style="width:250px;height:50px;color:#E9967A" placeholder="Password" required><br><br>
<input type="checkbox" name="remember" value="Remember Me">Remember Me<br>
<input type="button" style="width:250px;height:50px;color:FireBrick" value="LOGIN" required><br><br>

<a href="forgot.jsp">FORGOT PASSWORD?</a><br><br>

</form>
</center>
</html>