//package com.basic.problems;
//
//import java.util.*;
//import java.util.stream.*;
//
//public class KillTheDiner {
//
//	public static void main(String[] args) {
//
//		 For reading input from command line
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter the number of people sitting around dining table: ");
//
//		int numberOfPeopleAroundDiningTable = scanner.nextInt();
//
//		System.out.print("Enter person from whom killing is supposed to start: ");
//
//		int personToBeKilledNext = scanner.nextInt();
//
//		int indexOfPersonToBeKilledNext = personToBeKilledNext - 1;
//
//		validateInputs(numberOfPeopleAroundDiningTable, personToBeKilledNext);
//
//		// Populate array people with numbers staring from 1 to number of people
//		// mentioned above
//
//		List<Integer> peoplePresentAroundDiningTable =
//
//				IntStream.rangeClosed(1, numberOfPeopleAroundDiningTable).boxed().collect(Collectors.toList());
//
//		System.out.println(Arrays.toString(peoplePresentAroundDiningTable.toArray()));
//
//		while (peoplePresentAroundDiningTable.size() > 1) {
//			peoplePresentAroundDiningTable = killPerson(peoplePresentAroundDiningTable, indexOfPersonToBeKilledNext);
//			indexOfPersonToBeKilledNext = findIndexOfPersonToBeKilled(peoplePresentAroundDiningTable.size(),
//					indexOfPersonToBeKilledNext);
//		}
//		System.out.println("Person alive : " + peoplePresentAroundDiningTable.get(0));
//	}
//
//	private static int findIndexOfPersonToBeKilled(int numberOfPeopleRemaining, int indexOfPersonKilled) {
//		int iToBeKilled = indexOfPersonKilled + 1;
//		if (iToBeKilled < numberOfPeopleRemaining)
//			return 1;
//		else if (iToBeKilled == numberOfPeopleRemaining)
//			return 0;
//		return iToBeKilled;
//	}
//
//	private static List<Integer> killPerson(List<Integer> people, int indexOfPersonToBeKilled) {
//		people.remove(indexOfPersonToBeKilled);
//		System.out.println(Arrays.toString(people.toArray()));
//		return people;
//	}
//
//	private static void validateInputs(int numberOfPeopleAroundDiningTable, int personToBeKilledNext) {
//		if (personToBeKilledNext > numberOfPeopleAroundDiningTable) {
//			System.out.println("Invalid request to killer!!");
//			System.exit(1);
//		}
//	}
//
//}
