import java.util.*;
class Solution {
	
	static public int solution(String word, String[] pages) {
	        int answer = -1;
	        int len = pages.length;
	        int [] bagic = new int [len];
	        String [] url = new String[len];
	        for(int i=0; i<len; i++) {
	        	bagic[i] = findWord(pages[i],word);
	        	url[i] = pageUrl(pages[i]);
	        }
	        ArrayList<String>[] links  = new ArrayList [len];
	        for(int i=0; i<len; i++) {
	        	links[i] = outLinks(pages[i]);
	        }
	        double [] score = new double[len];
	        for(int i=0; i<len; i++) {
	        	score[i] = bagic[i];
	        	for(int j=0; j<len; j++) {
	        		if(i==j) {
	        			continue;
	        		}else {
	        			if(links[j].contains(url[i])) {
	        				score[i] += (double)bagic[j]/links[j].size();
	        			}
	        		}
	        	}
	        }
	        for(int i=0; i<len; i++) {
	        	if(answer==-1) {
	        		answer = i;
	        	}else {
	        		if(score[i]<score[answer]) {
	        			answer = i;
	        		}
	        	}
	        }
	        return answer;
	}
	static int findWord(String page, String word) {
		int result = 0;
		int len = word.length();
		page = page.toLowerCase();
		int index = 0;
		index = page.indexOf("<body>");
		int end = page.indexOf("</body>");
		word = word.toLowerCase();
		while(index < end) {
			int temp = page.indexOf(word, index);
			boolean flag = true;
			if(temp == -1) {
				break;
			}
			char prev = page.charAt(temp-1);
			char next = page.charAt(temp+len);
			if((prev<='z' && prev >='a')|| (next<='z' && next >='a')) {
				flag = false;
			}
			if(flag){
				result++;
				index = temp+len;
			}else {
				index = temp+len;
			}
		}
		return result;
	}
	static String pageUrl(String page) {
		String url="";
		String temp = "<meta property=\"og:url\" content=\"https://";
		int index = page.indexOf(temp);
		int end = page.indexOf("\"",index+temp.length());
		url = page.substring(index+temp.length(), end);
		return url;
	}
	static ArrayList<String> outLinks(String page){
		ArrayList<String> result = new ArrayList<String>();
		int index = 0;
		int end = page.length();
		String temp = "<a href=\"https://";
		while(index < end) {
			index = page.indexOf(temp,index);
			if(index == -1) {
				break;
			}
			int dummy = page.indexOf("\"",index+temp.length());
			String link =page.substring(index+temp.length(), dummy); 
			result.add(link);
			index = index+temp.length() + link.length();
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("asd");
		String temp2 = "<body>123123123213</body>";
		String []temp = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://a.com\"/>\n</head>  \n<body>\nBlind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n<a href=\"https://b.com\"> Link to b </a>\n</body>\n</html>",
				"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://b.com\"/>\n</head>  \n<body>\nSuspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n<a href=\"https://a.com\"> Link to a </a>\nblind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n<a href=\"https://c.com\"> Link to c </a>\n</body>\n</html>",
				"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://c.com\"/>\n</head>  \n<body>\nUt condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n<a href=\"https://a.com\"> Link to a </a>\n</body>\n</html>"};
		System.out.println(solution("blind",temp));
	}

}
