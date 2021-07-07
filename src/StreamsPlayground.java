import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsPlayground {

	public static void main(String[] args) {
		// mapExample();
		// flatMapExample();
		// filterExample();
		// System.out.println(sum(1, 3));
		// System.out.println(prod(1, 4));
		// System.out.println(pow(2, 3));
		// System.out.println(pow(2, 0));
		// System.out.println(pow(2, -1));
		// System.out.println(pow(2, -2));
		// System.out.println(join(Arrays.asList("Hello", "World"), " "));
		// System.out.println(toIndexValueString(25, 100));
	}

	private static void mapExample() {
		final List<Integer> list = Stream.of(1, 2, 3, 4, 5).map(x -> x * x).collect(Collectors.toList());
		System.out.println(list);
	}

	private static void flatMapExample() {
		final Set<String> list = Arrays.asList("Hola mundo", "Hola que tal", "Que tal tu").stream()
				.flatMap(p -> Stream.of(p.split(" "))).map(w -> w.toLowerCase()).collect(Collectors.toSet());
		System.out.println(list);
	}

	private static void filterExample() {
		final List<Integer> list = Stream.of(1, 2, 3, 4, 5).filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list);
	}

	private static long sum(int from, int to) {
		return LongStream.rangeClosed(from, to).reduce(0, (accum, x) -> accum + x);
	}

	private static long prod(int from, int to) {
		return LongStream.rangeClosed(from, to).reduce(1, (accum, x) -> accum * x);
	}

	private static double pow(int base, int exp) {
		if (exp < 0)
			return 1.0 / pow(base, -exp);
		else
			return LongStream.rangeClosed(0, exp).reduce(1, (accum, x) -> accum * base);
	}

	private static String join(Collection<String> words, String sep) {
		return words.stream().reduce("", (accum, x) -> accum + (accum != "" ? sep : "") + x);
	}

	private static String toIndexValueString(Collection<Integer> values) {
		final List<String> strValues = values.stream().map(item -> item.toString()).collect(Collectors.toList());
		return IntStream.range(0, strValues.size()).mapToObj(i -> String.valueOf(i)).reduce("",
				(accum, i) -> accum + " ," + i + ": " + strValues.get(Integer.parseInt(i)));
	}

}
