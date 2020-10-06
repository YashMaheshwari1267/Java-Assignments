package collection.assignments;

import java.util.Comparator;

public class MyComparator {
	class Genre implements Comparator<MovieDetails> {

		@Override
		public int compare(MovieDetails obj1, MovieDetails obj2) {
			if (obj1.getMovName() != obj2.getMovName()) {
				int x = obj1.getGenre().compareTo(obj2.getGenre());
				if (x > 0)
					return 1;
				else if (x < 0)
					return -1;
			}
			return 0;
		}
	}

	class Name implements Comparator<MovieDetails> {

		@Override
		public int compare(MovieDetails obj1, MovieDetails obj2) {
			if (obj1.getMovName() != obj2.getMovName()) {
				int x = obj1.getMovName().compareTo(obj2.getMovName());
				if (x > 0)
					return 1;
				else if (x < 0)
					return -1;
			}
			return 0;
		}
	}
}
