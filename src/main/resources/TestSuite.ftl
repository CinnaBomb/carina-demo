<!DOCTYPE html>
<html>
<head>
	<title>Test Results</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Test Name</th>
				<th>Status</th>
				<th>Duration</th>
			</tr>
		</thead>
		<tbody>
			<#list tests as test>
				<tr>
					<td>${test.name}</td>
					<td>${test.status}</td>
					<td>${test.duration}</td>
				</tr>
			</#list>
		</tbody>
	</table>
</body>
</html>
