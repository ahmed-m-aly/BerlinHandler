
public class ProcessData {

	// args[0] = input file name
	// args[1] = output file name
	public static void main(String[] args) {

		System.out.println("Starting the conversion process");
		//String inputFileName = "//Users//ahmed//Documents//MyWork//data//BerlinMod//trips.0.csv";
		String inputFileName = args[0];
		//String outputFileName = "//Users/ahmed//Documents//MyWork//data//BerlinMod//trips.10000.dat";
		String outputFileName = args[1];
		int updateFrequency = Integer.parseInt(args[2]); // in milliseconds
	
		BerlinModReader converter = new BerlinModReader();
		converter.ConvertSecondo(inputFileName, outputFileName, updateFrequency);
	}

}