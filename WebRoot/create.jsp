<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<title>
</title>
<head>
</head>
<body >
 <form id="form1" action="request.jsp">
<script language="javascript" type="text/javascript">
var count=0 ;
function additem(id)
{
  var row,cell,str;
  row = document.getElementByIdx_x(id).insertRow();
  if(row != null )
  {
cell = row.insertCell();
cell.innerHTML="<input id=\"St"+count+"\" type=\"text\" name=\"St"+count+"\" value= \"St"+count+"\"><input type=\"button\" value=\"删除\" onclick=\'deleteitem(this);\'>";
count ++;
  }
}
function deleteitem(obj)
{
  var curRow = obj.parentNode.parentNode;
  tb.deleteRow(curRow.rowIndex);
}
function getsub()
{
var re="";
for (var  i = 0 ;i<count;i++)
{
re += document.getElementsByName("St"+i)[0].value;
}
document.getElementByIdx_x("Hidden1").value=re;
}

</script><table id="tb"></table>
<input name="button" type="button" onclick='additem("tb")' value="添加>>"/><input type="submit" name="submit" onclick="getsub()" value="提交"/>
    <input id="Hidden1" name="Hidden1" type="hidden" value="" />
    </form>
</body>
</html>