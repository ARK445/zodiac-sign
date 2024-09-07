public class zodiacMethod extends zodiacSub {
    
    public static ZodiacAnimal getZodiacAnimalByYear(int year) {
        zodiacSub zs = new zodiacSub();
        int[] ratYears = {1936, 1948, 1960, 1972, 1984, 1996, 2008, 2020, 2032};
        int[] oxYears = {1937, 1949, 1961, 1973, 1985, 1997, 2009, 2021, 2033};
        int[] tigerYears = {1938, 1950, 1962, 1974, 1986, 1998, 2010, 2022, 2034};
        int[] rabbitYears = {1939, 1951, 1963, 1975, 1987, 1999, 2011, 2023, 2035};
        int[] dragonYears = {1940, 1952, 1964, 1976, 1988, 2000, 2012, 2024, 2036};
        int[] snakeYears = {1941, 1953, 1965, 1977, 1989, 2001, 2013, 2025, 2037};
        int[] horseYears = {1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026, 2038};
        int[] sheepYears = {1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027, 2039};
        int[] monkeyYears = {1944, 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040};
        int[] chickenYears = {1945, 1957, 1969, 1981, 1993, 2005, 2017, 2029, 2041};
        int[] dogYears = {1946, 1958, 1970, 1982, 1994, 2006, 2018, 2030, 2042};
        int[] pigYears = {1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043};

        // Check for the zodiac year and return the appropriate animal object
        if (isInArray(ratYears, year)) zs.Rat();
        if (isInArray(oxYears, year)) zs.ox();
        if (isInArray(tigerYears, year)) zs.tiger();
        if (isInArray(rabbitYears, year)) zs.rabbit();
        if (isInArray(dragonYears, year)) zs.dragon();
        if (isInArray(snakeYears, year)) zs.snake();
        if (isInArray(horseYears, year)) zs.horse();
        if (isInArray(sheepYears, year)) zs.sheep();
        if (isInArray(monkeyYears, year)) zs.monkey();
        if (isInArray(chickenYears, year)) zs.chicken();
        if (isInArray(dogYears, year)) zs.dog();
        if (isInArray(pigYears, year)) zs.pig();

        return null;  // Return null if no matching animal is found
    }

    // Utility method to check if a year is in the given array
    public static boolean isInArray(int[] years, int year) {
        for (int y : years) {
            if (y == year) {
                return true;
            }
        }
        return false;
    }
}