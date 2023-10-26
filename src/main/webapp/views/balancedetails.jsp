<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
td{
color: red;
}
.links {
	background-color: lightskyblue;
	width:90%;
	border-radius: 10px;
	position: absolute;
	top: 10%;
	left: 50%;
	transform: translate(-50%, -50%);
}

button {
	border-radius: 3px;
}
h1{
color:blue;
	position: absolute;
	top: 30%;
	left: 50%;
	transform: translate(-50%, -50%);
}

table {
	color:maroon;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 35%;
	height: 15%;
}
</style>
</head>
<body>
	<center>

		<div class="links">
			<button>
				<a href="/">Home</a>
			</button>
			<button>
				<a href="/newaccount">NewAccount</a>
			</button>
			<button>
				<a href="/balance">Balance</a>
			</button>
			<button>
				<a href="/deposit">Deposit</a>
			</button>
			<button>
				<a href="/withdraw">Withdraw</a>
			</button>
			<button>
				<a href="/transfer">Transfer</a>
			</button>
			<button>
				<a href="/closeac">CloseA/C</a>
			</button>
			<button>
				<a href="/aboutus">AboutUs</a>
			</button>
		</div>
		<br>
						<h1>YOUR ACCOUNT DETAILS ARE .......</h1>
		
		<table border="1">
			<tr>
				<th>ACCOUNT NUMBER</th>
				<th>NAME</th>
				<th>BALANCE</th>
			</tr>
			<tr>
				<td>${bank.accountno}</td>
				<td>${bank.name}</td>

				<td>${bank.balance}</td>


			</tr>
		</table>
	</center>
</body>
</html>

