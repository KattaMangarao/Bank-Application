<!DOCTYPE html>
<html>
    <head>
        <style>
           
            .links{
                background-color:lightskyblue;
                border-radius: 10px;
            }
           .sevice{
            position: absolute;
            top: 49%;
            left: 7%;
            transform: translate(-50%,-50%);

           }
           .welcome{
            position: absolute;
            top: 53%;
            left:88%;
            transform: translate(-50%,-50%);
            text-align: right;
           
           }
           button{
            border-radius: 3px;
           }
          
        </style>
    </head>
    <body>
        <center>
            <div class="heading">
            <h1 style="color: red;">SDFC BANK</h1>
            <h2 style="color: blue;">EXTRAORDINARY SERVICES</h2>
            </div>
            <br>
            <div class="links">
        <button><a href="/">Home</a></button>
        <button><a href="/newaccount">NewAccount</a></button>
        <button><a href="/balance">Balance</a></button>
        <button><a href="/deposit">Deposit</a></button>
        <button><a href="/withdraw">Withdraw</a></button>
        <button><a href="/transfer">Transfer</a></button>
        <button><a href="/closeac">CloseA/C</a></button>
        <button><a href="/aboutus">AboutUs</a></button>
            </div>
            <br>
            <div class="form">
                <form action="/trans">
                    <table>
                    <h2 style="background-color: bisque;border-radius: 10px;width: 30%;">TRANSFER FORM</h2>
                   
                <tr><td>FROM ACCOUNT NUMBER:</td><td><input type="text"  name="faccountno" required="required" placeholder="sender account number"></td></tr>
                <tr><td>FROM NAME:</td><td><input type="text" name="fname" placeholder="sender name" required="required" ></td></tr>
                <tr><td>FROM PASSWORD:</td><td><input type="password" name="fpassword" placeholder=" sender password" required="required" ></td></tr>
                 <tr><td> TO ACCOUNT NUMBER:</td><td><input type="text"  name="taccountno" required="required" placeholder="receiver account number"></td></tr>
                <tr><td>TO NAME:</td><td><input type="text" name="tname" placeholder="reciver customer name" required="required" ></td></tr>
               
                <tr><td>TRANSFER AMOUNT:</td><td><input type="number" name="balance" placeholder="transfer amount" required="required" ></td></tr>
                 <tr><td><center><input type="submit" value="Transfer"></center></td></tr>
                
          
                </table>
                </form>
            </div>
        </center>
        <div class="sevice">
           <center> <h2 style="border: 1px solid black;background-color:bisque;border-radius: 10px;width:100%;">SERVICES</h2></center>
            
            . Whatsapp Banking<br>
            . Doorstep Banking <br>
            . UPI Autopay <br>
            . Mobile Banking<br>
            . Online Banking <br>
            . Remote Banking <br>
            . Phone Banking <br>
            . Online Banking <br>
            
            </div>
            <div class="welcome">
                <h2 style="border: 1px solid black;background-color:bisque;border-radius: 10px;width:100%;">WELCOME....</h2>
                <p>
                Say hello to a unique banking experience that meets all your requirements and guarantees a personalised service. We offer a wide range of accounts, deposits and loans in all the major currencies....
            </p>
                </div>
                
    </body>
</html>