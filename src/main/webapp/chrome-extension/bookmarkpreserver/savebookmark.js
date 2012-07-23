/**
 * 
 */

function saveBookmark(){
	chrome.tabs.getSelected(null, function (currentTab) {
		console.log(currentTab);
		var url = currentTab.url;
		sendRequest(url);
	});
}

function sendRequest(data){
	//var jsonData = "{'data':'"+data+"'}";
	var xhr = new XMLHttpRequest();
	  xhr.onreadystatechange = function(data) {
	    if (xhr.readyState == 4) {
	      if (xhr.status == 200) {
	        var data = xhr.responseText;
	        alert(data);
	      } else {
	        alert('error');
	      }
	    }
	  }
	  // Note that any URL fetched here must be matched by a permission in
	  // the manifest.json file!
	  var url = 'http://192.168.6.32:7777/BookmarkPreserver/save/bookmark?url='+data;
	  xhr.open('POST', url, true);
	  xhr.send();
}

chrome.browserAction.onClicked.addListener(saveBookmark);