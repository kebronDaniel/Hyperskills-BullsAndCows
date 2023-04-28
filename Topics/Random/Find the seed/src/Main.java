import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialSeed = scanner.nextInt();
        int finalSeed = scanner.nextInt();
        int pseudorandomNumbers = scanner.nextInt();
        int range = scanner.nextInt();

        HashMap<Integer, Integer> maxRandomNumbersCollections = new HashMap<>();

        int min = 0;
        for (int i = initialSeed; i <= finalSeed; i++){
            min = getMaxFromRandomNumbers(i,pseudorandomNumbers,range);
            maxRandomNumbersCollections.put(i,min);
        }
        min  = Collections.min(maxRandomNumbersCollections.values());

        int targetKey = 0;
        for (Map.Entry<Integer, Integer> entry : maxRandomNumbersCollections.entrySet()){
            if (min == entry.getValue()){
                targetKey = entry.getKey();
                break;
            }
        }
        System.out.println(targetKey);
        System.out.println(min);

    }

    public static int getMaxFromRandomNumbers(int seed, int pseudorandomNumbers, int range){
        List<Integer> randomNumbers = new ArrayList<Integer>();
        Random random = new Random(seed);
        for (int i = 0; i<pseudorandomNumbers;i++){
            int randomNumber = random.nextInt(range);
            randomNumbers.add(randomNumber);
        }
        return Collections.max(randomNumbers);
    }
}