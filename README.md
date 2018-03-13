# lab-assignment-1
Base project for lab assignment 1

1. Elements:
	First of all, the web page starts with <html op="news">, this tag refers to the begining of the html document
	specifically o the file news, therefore the document ends with the tag </html> tag, everything that is inside
	this two tags are parts of the document. Then the tag #shadow-root appears with it's own tag for shadow 
	(<shadow>) which contains two tags, <head> and <body>, what this section does is that allows the browser to know
	that some parts of the code are not meant for user development.

	Then the head tag appears, in this tag the data of the document is defined fo example style, links and 
	title of the web page, the it closes with the closing tag for the head </head>

	Moving on, then <body> reaches our sight. In this tag the main information is displayed, links, center and other
	tags that we'll be reviewing ahead. The body basicaly contains all of the displayed data such as links, text, 
	hyperlinks, tables, scripts, and so on.Each sub-tag describes how that specific element will work, on it's own 
	defined space using opening and closing tags.
	
	Now we see the <center>, <table>, <tr>, <td>, and <a> tags. Center is used to center align text. Table defines a new
	table who has it's dimensions snd style defined. Tr refers to Table row, so it creates a new row in the table 
	defined previously. Td refers to Table data, in this section the information that must appear on that specific
	cell of the table is displayed. <a> tag defines a hiperlink to another site. Each row/table could (must) have
	each own body refered as <tbody>, also each table/row can hace another table/row inside them.

	Other tags we see are <span> and <b>, span is used for changing the colour of the text. And <b> is used to make 
	the text bold.

	The final tag (that is not mentioned before, not the last one in the code) is the script tag, this tag tells the
	browser where is the code that has to execute, so it's code that the uer executes.

	Finally, every opening tag must have it's closing tag, so the browser knows were they beging and end.

2. Sources:
	News: Corresponds to the html document.
	hn.js?Xme.....: Corresponds to the script file
	news.css?Xme..: Corresponds to the css Cascade Style Sheets, defines the style of the page.
	Grayarrow.gif: Image of an arrow, that is displayed on the web page.
	y18.gif: Image of the news Ycombinator logo.

3. Network:

	Xhr request is used to make request to web servers, this allows the user web browser to make as many request as 
	it needs to make the browsing more dinamic. It could use any text codification technique. This request are sent
	as soon as the file is received by the user.

4. Security:

	Comodoro RSA Domain is the one who certificates, and it's expiration date is 21-08-2019