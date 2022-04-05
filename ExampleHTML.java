package JavaProgramming;

public class ExampleHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<title>CountDown1</title>\r\n"
				+ "<style>\r\n"
				+ ".abc{\r\n"
				+ "    text-align: center;\r\n"
				+ "    font-size: large;\r\n"
				+ "    font-family: 'Courier New', Courier, monospace;\r\n"
				+ "    font-style: italic;\r\n"
				+ "    display: flex;\r\n"
				+ "    justify-content: center;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "}\r\n"
				+ "input[type=text]{\r\n"
				+ "    margin: 10px;\r\n"
				+ "    outline: none;\r\n"
				+ "    border: none;\r\n"
				+ "    font-size: 15px;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "    text-align: center;\r\n"
				+ "    border-radius: 10px;\r\n"
				+ "    color: black;\r\n"
				+ "    width: 20%;\r\n"
				+ "    height: 50px;\r\n"
				+ "    background-color: rgb(216, 216, 216);\r\n"
				+ "}\r\n"
				+ "input[type=date]{\r\n"
				+ "    color: black;\r\n"
				+ "    width: 20%;\r\n"
				+ "    height: 50px;\r\n"
				+ "    background-color: rgb(206, 206, 206);\r\n"
				+ "    outline: none;\r\n"
				+ "    border: none;\r\n"
				+ "    font-size: 15px;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "    text-align: center;\r\n"
				+ "    border-radius: 10px;\r\n"
				+ "}\r\n"
				+ "button{\r\n"
				+ "    margin: 10px;\r\n"
				+ "    width: 15%;\r\n"
				+ "    padding: 5px;\r\n"
				+ "    background-color: rgb(202, 54, 54);\r\n"
				+ "    border: none;\r\n"
				+ "    border-radius: 10px;\r\n"
				+ "}\r\n"
				+ "#b{\r\n"
				+ "    font-family: 'Courier New', Courier, monospace;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "}\r\n"
				+ ".t{\r\n"
				+ "    margin: 50px;\r\n"
				+ "    color: brown;\r\n"
				+ "    font-size: 25px;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "}\r\n"
				+ ".t1{\r\n"
				+ "    font-size: 20px;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "    color: royalblue;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body onload=\"callme()\">\r\n"
				+ "    <form name=\"form1\">\r\n"
				+ "        <div class=\"abc\">\r\n"
				+ "        <table id=\"dis\">\r\n"
				+ "            <tr>\r\n"
				+ "                <td colspan=\"4\" class=\"t\" id=\"msg\">EVENTS & PARTIES</td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td colspan=\"4\" class=\"t1\" id=\"msg2\">Remaining Days For</td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "            <td colspan=\"4\" class=\"t2\" id=\"eve\">Event Name Display Here</td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "            <td id=\"days\"></td>\r\n"
				+ "            </tr>\r\n"
				+ "            </table>\r\n"
				+ "        </div>\r\n"
				+ "    </form>\r\n"
				+ "<script>\r\n"
				+ "    function countdown()\r\n"
				+ "    {\r\n"
				+ "        const v1=new Date(\"";
		
		String s2="28, 2022 00:00:00";
		
		String s3="\").getTime();\r\n"
				+ "\r\n"
				+ "        var today=new Date().getTime();\r\n"
				+ "\r\n"
				+ "        var diff = v1-today;\r\n"
				+ "\r\n"
				+ "        var d = Math.floor(diff/(1000*60*60*24));\r\n"
				+ "        console.log(d);\r\n"
				+ "\r\n"
				+ "        document.getElementById(\"days\").innerText=d+\" days\";\r\n"
				+ "    }\r\n"
				+ "function callme(){\r\n"
				+ "    document.body.style.background=\"rgba(255, 255, 0, 0.5)\";\r\n"
				+ "	setInterval(countdown,1000);}\r\n"
				+ "</script>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		System.out.println(s1+s2+s3);
				

	}

}
