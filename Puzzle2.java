package adventofcode;

import java.io.ByteArrayInputStream;
import java.util.*;

public class Puzzle2
{
	static void fakeInput()
	{
		String input = "nkucgflathzwwijtrevymbdplq\n" +
				"nkucgflathzwsidxrlvymbdpiq\n" +
				"nkucgjlathqwsijxrevymbypoq\n" +
				"nkucgflarrzwsmjxrevymbdpoq\n" +
				"nkucgflzthtwsijxrevymbdpjq\n" +
				"nkucgflahhzwskjxrevymbgpoq\n" +
				"bkycgflathzwsijxrsvymbdpoq\n" +
				"nkucgflathzwsijxdevymbdmog\n" +
				"nkucgflaehzwsmjxrevymbdpow\n" +
				"nkucgflathzwsijxrevwmbdnbq\n" +
				"nkucgflathzssijxrevynbdqoq\n" +
				"ngucgflathzwsijxsevymndpoq\n" +
				"nfucgflathzvsijxrevymbspoq\n" +
				"nkucgflwthzwsijxreeymbdpkq\n" +
				"nkucgflpthzwsijxrevdmbdpoe\n" +
				"nkungflatuzwsijurevymbdpoq\n" +
				"nkucgflathzwsiqxrevyybdpom\n" +
				"nkucgflathzwsicxrevtmbtpoq\n" +
				"nkucgfladhzwsijxreuymbdboq\n" +
				"nkumgflathznsijxzevymbdpoq\n" +
				"nkuagflethzwsijxrqvymbdpoq\n" +
				"nkucgflatozwhijxrevymbdpkq\n" +
				"nkuggflathzwsijxrejymbdpob\n" +
				"nkucgflathzwlijxrqvambdpoq\n" +
				"hkucnflathzasijxrevymbdpoq\n" +
				"nkuigflathzwsirxrevymbdooq\n" +
				"nkucgflatezwsijxwetymbdpoq\n" +
				"nkucmflavhbwsijxrevymbdpoq\n" +
				"nkucgflathzwssjxrevytbmpoq\n" +
				"nkucgflmthzwsvjxrevymbdpgq\n" +
				"nkucgtlathzwsijcrevymbjpoq\n" +
				"nkucgflathfwsfjxrevymbdpsq\n" +
				"nkucgflathjwsijxrwvymbdpok\n" +
				"nkucgeldthzwsijxrevymqdpoq\n" +
				"nkutgcpathzwsijxrevymbdpoq\n" +
				"nkucgflaehzmsijxrevymydpoq\n" +
				"mkucdflathzwsvjxrevymbdpoq\n" +
				"nkucgflathzwsijxtevymidpfq\n" +
				"nkucgfllthzwsijirevlmbdpoq\n" +
				"nkucgfuathzwsijxrevymbqpou\n" +
				"nkufgflathzwsijxrgvymbdpor\n" +
				"nkuygflatrzwsijxrevymbdpoo\n" +
				"nkunoflathzwsijxrevyabdpoq\n" +
				"nksogflathzwsijxrevymbdpeq\n" +
				"nkucgflathzwciexrevymbdhoq\n" +
				"nkucgfnathzwsijxdevyobdpoq\n" +
				"nkudgflazhzwsijxrevymbmpoq\n" +
				"nkucgylathzwscjxrevymbdaoq\n" +
				"nkucgflqthzisijxrerymbdpoq\n" +
				"nkucgxlathzwsijxgebymbdpoq\n" +
				"nkucgflathzssijxrwvymadpoq\n" +
				"nkucgflathzwsijxrvvymbdloi\n" +
				"nkucaflathzwskjxzevymbdpoq\n" +
				"wkuchflathzwsijxrevymbdioq\n" +
				"nkucgilathzwsijxrgvympdpoq\n" +
				"nkubgflaohzwsijxrevymbnpoq\n" +
				"nkucgwoathzwnijxrevymbdpoq\n" +
				"nkprgflathzwsijxrevywbdpoq\n" +
				"nkucgflatlzwsijxievymzdpoq\n" +
				"nkucgflathzwsijxrevymbmdow\n" +
				"nkucgzlathzwsitlrevymbdpoq\n" +
				"nkubgfladhzwsijxrevymbdpsq\n" +
				"nkucgflathzwsijxrzvyibdroq\n" +
				"wkucgflathznsijqrevymbdpoq\n" +
				"nkupgilathzwsijxrnvymbdpoq\n" +
				"nkucgflathzwwijnrevymgdpoq\n" +
				"nkucgflathjwsijxrewymbopoq\n" +
				"mkwcdflathzwsvjxrevymbdpoq\n" +
				"nkucgflathzwsujxoevymbdboq\n" +
				"nkucvflathzwsojxrevymzdpoq\n" +
				"nkocgflabhzwsijxrevyebdpoq\n" +
				"skuciflpthzwsijxrevymbdpoq\n" +
				"nkuxgflathzrsijxrevymbupoq\n" +
				"nkucgblathzwsezxrevymbdpoq\n" +
				"nkucgflathzwsijxrevymbvtop\n" +
				"nkucdflathzwsiaxrefymbdpoq\n" +
				"nkucgflathzwsijxzevkmbdpmq\n" +
				"nkucgflarhzwsijroevymbdpoq\n" +
				"nkuccflathzwsinxrevymsdpoq\n" +
				"nkucgflathzwsijxregymidsoq\n" +
				"nkucgflathnwsijxrvvumbdpoq\n" +
				"nkucgfaathzwssjxrevymbdwoq\n" +
				"nkucgflothzwsijxrevymbdloz\n" +
				"naucgulathzwsijxremymbdpoq\n" +
				"nkucgflaqhzwsijxrevymbdnqq\n" +
				"wkucgflatrzwsijxrevymbdpof\n" +
				"nvucgflaehzwyijxrevymbdpoq\n" +
				"nkusaflaahzwsijxrevymbdpoq\n" +
				"nkucgfkathzwsijxrevymbdbfq\n" +
				"nkucgfkathzwsijrrevymodpoq\n" +
				"nkuegflathzwsijxrrvbmbdpoq\n" +
				"ykucgflathzwsijfrlvymbdpoq\n" +
				"nkucgflathzrsujxrevymbdkoq\n" +
				"nkuclflatsowsijxrevymbdpoq\n" +
				"nkucgflathzwsgjxrqvymbdpor\n" +
				"ekucgflathzwsijorevlmbdpoq\n" +
				"nkucgflathizsijgrevymbdpoq\n" +
				"nkucgfoathzksijbrevymbdpoq\n" +
				"nkucgflachzwsijxrevymbupoa\n" +
				"nkuhgflathzwsijxravylbdpoq\n" +
				"nkncgflithzwsijnrevymbdpoq\n" +
				"nvucgjlathzjsijxrevymbdpoq\n" +
				"nhucgflathzwsijxrtvymbtpoq\n" +
				"akucgflathzwhijxrevymbdpor\n" +
				"nkucgflatozisijxrvvymbdpoq\n" +
				"nkucgzlatgzwsijxrevymbepoq\n" +
				"nkjcgflqthmwsijxrevymbdpoq\n" +
				"nkucgflaohzosijxrhvymbdpoq\n" +
				"ntucgflatrzwsijxrevymbdpol\n" +
				"nkucgflathzwsijkriqymbdpoq\n" +
				"nkuggflathzwsijmrevymbdpvq\n" +
				"nkucgflpmhzwsmjxrevymbdpoq\n" +
				"okucgflathzwsijxrevgmbdsoq\n" +
				"nkucgflaehzwkijxrevymwdpoq\n" +
				"zkucgfllthzwsijxrevymbdpod\n" +
				"nkicgflathzasijxfevymbdpoq\n" +
				"kkucgfhathzwsijxaevymbdpoq\n" +
				"nkucqflsthzwsijxrevyjbdpoq\n" +
				"nkucgflaghzwsijxoevykbdpoq\n" +
				"nkucgflaohzwsljxryvymbdpoq\n" +
				"bkucfflathzwsijxrexymbdpoq\n" +
				"nkucnflathzwsbjxrpvymbdpoq\n" +
				"nkucjflatlzwsijxrevymqdpoq\n" +
				"nkucgflathzwsijsyevyxbdpoq\n" +
				"nkwcgflathzosijxqevymbdpoq\n" +
				"nkucgslathzesijxievymbdpoq\n" +
				"nkuciflauhzwsiaxrevymbdpoq\n" +
				"nkucgflathzwsiwxreeymbdwoq\n" +
				"nkucgblatwzwsijxkevymbdpoq\n" +
				"njucgfkathzwsijxrevymbvpoq\n" +
				"nkucgfladhzwsijfrevyibdpoq\n" +
				"nkukgflathzwsijprenymbdpoq\n" +
				"nkucgflathzwsijxrchymbupoq\n" +
				"nkucgfeathzwsitxaevymbdpoq\n" +
				"nkufjflathzwsijxresymbdpoq\n" +
				"nkuggflatlzwsijxrevymbdpoa\n" +
				"nkucgflsthnwsijxrevumbdpoq\n" +
				"nkuceflathzwsnjxrevymbmpoq\n" +
				"nkucgflabhzwsijxrevymblplq\n" +
				"nkucgfmathzwsijxrevdybdpoq\n" +
				"niuvgflathzwsijxrcvymbdpoq\n" +
				"nkscgflathzwsijxrevyzbdooq\n" +
				"nkucgflatszwsbjxrevymbgpoq\n" +
				"nkucgflazhzwsijxcevymzdpoq\n" +
				"nkucgflathzwsfjqrevymbdpxq\n" +
				"nkucgflathcwsijxrrvymbdroq\n" +
				"nkurgflathzwsijxrepymzdpoq\n" +
				"nlucgflathzwrijxrevdmbdpoq\n" +
				"kkucgflkthzwswjxrevymbdpoq\n" +
				"nktcgflathzwgijxrevbmbdpoq\n" +
				"nbucgfiathzwsijxreyymbdpoq\n" +
				"lkucgflathswsijxrevymbdpxq\n" +
				"ntucgflathzwswrxrevymbdpoq\n" +
				"nkscgflathzwssjxravymbdpoq\n" +
				"nuocgflathzwsijxrevyebdpoq\n" +
				"nbucgllathzwsijxregymbdpoq\n" +
				"ckucbflathzwsijxrelymbdpoq\n" +
				"nkucgflathzwsijxremymbqpor\n" +
				"nkgcgfljthzwsijkrevymbdpoq\n" +
				"nkdcgflashzwsijxrjvymbdpoq\n" +
				"nkecgflathzwsijxuevumbdpoq\n" +
				"njucgflatpfwsijxrevymbdpoq\n" +
				"nkucgwlathzjsijxrevymbzpoq\n" +
				"nkucgfxathzqsijxrenymbdpoq\n" +
				"dkfcgflathzwsijxrevymbdtoq\n" +
				"nkupgfhathzwsijxrevymbjpoq\n" +
				"nkucgflathzwsjjxrevymldooq\n" +
				"pkucgfbathhwsijxrevymbdpoq\n" +
				"nkuciflayhzwsijxrevymbdpfq\n" +
				"nkucpfdathzwsajxrevymbdpoq\n" +
				"ykucgflathdwsijzrevymbdpoq\n" +
				"nkucgwlstnzwsijxrevymbdpoq\n" +
				"nkucwfzazhzwsijxrevymbdpoq\n" +
				"nkucgflatczwssjxretymbdpoq\n" +
				"nkucgflathzwsijpreaymxdpoq\n" +
				"ntucgflathzwsijxrepymvdpoq\n" +
				"nkucgqlathzdsijxrevymbopoq\n" +
				"nkucgflathzusijxfevymbdptq\n" +
				"nkocgflathzwdijxrevymbipoq\n" +
				"nklcgflatgzwsijxrevymbdsoq\n" +
				"nkucgflathzwsgjxgevymbopoq\n" +
				"nkucgflathzwuijxreaymbdyoq\n" +
				"nkucgwlathzwsvjxrevymbdpos\n" +
				"nkucrflathzwliqxrevymbdpoq\n" +
				"nkucgflathzxsijxievysbdpoq\n" +
				"nkufgolhthzwsijxrevymbdpoq\n" +
				"niucgflathzwsiixrevyabdpoq\n" +
				"nkucgflathzhsijxrevymbdyuq\n" +
				"nkucgqlathzwsijxreaymbdpob\n" +
				"nzucgflathzesijxrevymwdpoq\n" +
				"nkucgflatlzwsirxrevymmdpoq\n" +
				"nkucgfxavhzwsijxrevymbwpoq\n" +
				"nkucgflathswsijxrevvmbdpoe\n" +
				"nkucgfgethzwsrjxrevymbdpoq\n" +
				"nkucgzlayhzwsinxrevymbdpoq\n" +
				"nkucgflwthzwsiyxrevymbdpdq\n" +
				"nkucgflpthzwsijxrezombdpoq\n" +
				"nkurgflathdwsijxuevymbdpoq\n" +
				"nkjcgflathzwsijxrevkmbdpoc\n" +
				"nkucmflatuzwsijxrevmmbdpoq\n" +
				"nkucgfldthzwsijxrevevbdpoq\n" +
				"nkucgflatrzgsijxrevambdpoq\n" +
				"nkicgflathzwsijxrevymhdhoq\n" +
				"nkbcgflathzwsijxrevymxdpos\n" +
				"nkucgflatfzwsijxrevymwdqoq\n" +
				"hkucgflaqwzwsijxrevymbdpoq\n" +
				"nkjcgflathzvsijxrevyjbdpoq\n" +
				"niucgflathzwsijxrezymbdpob\n" +
				"ynucgflathzwsijxremymbdpoq\n" +
				"nkubgflathzwsijxrhvymldpoq\n" +
				"nkucqflrthzesijxrevymbdpoq\n" +
				"nkucgulathzwsijxrevyubdioq\n" +
				"nkuczflathzwsijxaebymbdpoq\n" +
				"nkucgfldthzwsibxrevymrdpoq\n" +
				"nkucgflatwzdsijxrevymsdpoq\n" +
				"nkncgffathzwsijxrejymbdpoq\n" +
				"nkucgflathzqsijxrevxmodpoq\n" +
				"nkucgflathwwsijqrevymbipoq\n" +
				"nkucgflathzwhajxrebymbdpoq\n" +
				"gkucgflathzwsijxreirmbdpoq\n" +
				"nkucgflathzesijzravymbdpoq\n" +
				"nkucgflaghzwsijxrerymbdplq\n" +
				"wkucgflathxwgijxrevymbdpoq\n" +
				"nkucgfljthfwsijxrevymbdpfq\n" +
				"nkucgflathwwsimxrevymbdpjq\n" +
				"nkucgdlachzwsijxrevymmdpoq\n" +
				"njucgclathzwsiixrevymbdpoq\n" +
				"nkucgflatdzwsijxrevymzrpoq\n" +
				"nkuckflatvzcsijxrevymbdpoq\n" +
				"nkucgflathzhsijxrevqmbkpoq\n" +
				"nkucqflathzjsijvrevymbdpoq\n" +
				"nkucgftathzwsijxrevympdpoi\n" +
				"nvucgflatmzwsijxrevymbdpsq\n" +
				"nkocgflathznsijxrevymbdphq\n" +
				"mkgcgflathzwsijxrevymbdpvq\n" +
				"nkucnflathzwsijbrevymbdcoq\n" +
				"nkucgflathzwsijsrevymsdgoq\n" +
				"nkuckflatxzwsiwxrevymbdpoq\n" +
				"nkucyflathzwsijxrehcmbdpoq\n" +
				"nkurgflajhzwsijxrevkmbdpoq\n" +
				"wkucgflathzwsijxrfvymbapoq\n" +
				"nkucgflathzwsijxaekymbdpon\n" +
				"nkucgfkathywsijxrevymbdpsq\n" +
				"nkucgflathzwsijxaexcmbdpoq\n" +
				"nkucgflathzwsijxrevymddhox\n" +
				"nkucgflathzwgijxrevymydooq\n" +
				"nkycqflathzwsijxrezymbdpoq\n" +
				"nkucgflathwwsijxrevymbspsq\n" +
				"nkucgflatpzwssjfrevymbdpoq\n" +
				"nkwcgflhthzwsijxrevcmbdpoq";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}
	
	public static void main(String[] args)
	{
		var list = new ArrayList<String>();
		
		fakeInput();
		try (var input = new Scanner(System.in))
		{
			while (input.hasNextLine())
				list.add(input.nextLine().trim());
		}
		
		var result = "";
		for (var i = 0; i < list.size(); i++)
		{
			var offset = list.get(i).length();
			for (var j = i + 1; j < list.size(); j++)
			{
				int[] offsetData = checkStrings(list.get(i), list.get(j));
				if (offsetData[0] == 1)
				{
					var offsetStr = list.get(i).substring(0, offsetData[1]);
					var offsetIndexStr = list.get(i).substring(offsetData[1] + 1);
					System.out.println(offsetStr.concat(offsetIndexStr));
				}
			}
		}
	}
	
	private static int[] checkStrings(String s, String s1)
	{
		var offset = s.length();
		var offsetIndex = 0;
		
		for (var i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == s1.charAt(i))
				--offset;
			else
				offsetIndex = i;
		}
		
		return new int[]{offset, offsetIndex};
	}
}
