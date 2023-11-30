import java.security.SecureRandom;

public class WordBank
{
	SecureRandom random = new SecureRandom();
	private String word = "";

	public String generateWord()
	{
		int wordNum = random.nextInt(100);
		switch(wordNum)
		{
			case 0:
				word = "larynx";
				break;
			case 1:
				word = "magahertz";
				break;
			case 2:
				word = "knapsack";
				break;
			case 3:
				word = "pizazz";
				break;
			case 4:
				word = "numbskull";
				break;
			case 5:
				word = "mnemonic";
				break;
			case 6:
				word = "phlegm";
				break;
			case 7:
				word = "schnapps";
				break;
			case 8:
				word = "transgress";
				break;
			case 9:
				word = "transript";
				break;
			case 10:
				word = "swivel";
				break;
			case 11:
				word = "stronghold";
				break;
			case 12:
				word = "vaporize";
				break;
			case 13:
				word = "quorum";
				break;
			case 14:
				word = "voyeurism";
				break;
			case 15:
				word = "whomever";
				break;
			case 16:
				word = "vodka";
				break;
			case 17:
				word = "syndrome";
				break;
			case 18:
				word = "rickshaw";
				break;
			case 19:
				word = "wyvern";
				break;
			case 20:
				word = "zigzag";
				break;
			case 21:
				word = "zephyr";
				break;
			case 22:
				word = "transplant";
				break;
			case 23:
				word = "whiskey";
				break;
			case 24:
				word = "thriftless";
				break;
			case 25:
				word = "thunbscrew";
				break;
			case 26:
				word = "wimpy";
				break;
			case 27:
				word = "twelfths";
				break;
			case 28:
				word = "zilch";
				break;
			case 29:
				word = "witchcraft";
				break;
			case 30:
				word = "zodiac";
				break;
			case 31:
				word = "rhubarb";
				break;
			case 32:
				word = "quixotic";
				break;
			case 33:
				word = "queue";
				break;
			case 34:
				word = "oxidize";
				break;
			case 35:
				word = "psyche";
				break;
			case 36:
				word = "pixel";
				break;
			case 37:
				word = "megahertz";
				break;
			case 38:
				word = "klutz";
				break;
			case 39:
				word = "kiosk";
				break;
			case 40:
				word = "knapsack";
				break;
			case 41:
				word = "matrix";
				break;
			case 42:
				word = "marquis";
				break;
			case 43:
				word = "larynx";
				break;
			case 44:
				word = "jukebox";
				break;
			case 45:
				word = "jawbreaker";
				break;
			case 46:
				word = "jaywalk";
				break;
			case 47:
				word = "jaundice";
				break;
			case 48:
				word = "icebox";
				break;
			case 49:
				word = "hyphen";
				break;
			case 50:
				word = "haiku";
				break;
			case 51:
				word = "gossip";
				break;
			case 52:
				word = "grogginess";
				break;
			case 53:
				word = "haphazard";
				break;
			case 54:
				word = "gnostic";
				break;
			case 55:
				word = "glyph";
				break;
			case 56:
				word = "glowworm";
				break;
			case 57:
				word = "galvanize";
				break;
			case 58:
				word = "gazebo";
				break;
			case 59:
				word = "galaxy";
				break;
			case 60:
				word = "fuchsia";
				break;
			case 61:
				word = "foxglove";
				break;
			case 62:
				word = "flopping";
				break;
			case 63:
				word = "flapjack";
				break;
			case 64:
				word = "fluffiness";
				break;
			case 65:
				word = "exodus";
				break;
			case 66:
				word = "fishhook";
				break;
			case 67:
				word = "equip";
				break;
			case 68:
				word = "espionage";
				break;
			case 69:
				word = "fjord";
				break;
			case 71:
				word = "embezzle";
				break;
			case 72:
				word = "dwarves";
				break;
			case 73:
				word = "fixable";
				break;
			case 74:
				word = "disavow";
				break;
			case 75:
				word = "curacao";
				break;
			case 76:
				word = "duplex";
				break;
			case 77:
				word  = "croquet";
				break;
			case 78:
				word = "cockiness";
				break;
			case 79:
				word = "crypt";
				break;
			case 80:
				word = "cobweb";
				break;
			case 81:
				word = "buzzard";
				break;
			case 82:
				word = "buffalo";
				break;
			case 83:
				word = "buffoon";
				break;
			case 84:
				word  = "buckaroo";
				break;
			case 85:
				word = "blizard";
				break;
			case 86:
				word = "boggle";
				break;
			case 87:
				word = "blitz";
				break;
			case 88:
				word = "bayou";
				break;
			case 89:
				word = "beekeeper";
				break;
			case 90:
				word = "awkward";
				break;
			case 91:
				word = "avenue";
				break;
			case 92:
				word = "abyss";
				break;
			case 93:
				word = "bagpipes";
				break;
			case 94:
				word = "absurd";
				break;
			case 95:
				word = "bookworm";
				break;
			case 96:
				word = "boxful";
				break;
			case 97:
				word = "faking";
				break;
			case 98:
				word = "bikini";
				break;
			case 99:
				word = "zombie";
				break;
		}
		return word;
	}
}