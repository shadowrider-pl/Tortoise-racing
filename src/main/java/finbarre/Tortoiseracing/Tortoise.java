package finbarre.Tortoiseracing;

public class Tortoise {
	public static int[] race(int v1, int v2, int g) {

		if (v1 >= v2)
			return null;

		int[] result = new int[3];
		int diffV = v2 - v1;
		double timeInSeconds = (60 * 60 * g) / diffV;
		result[0] = (int) (timeInSeconds / 3600);
		result[1] = (int) ((timeInSeconds - (result[0] * 3600)) / 60);
		result[2] = (int) ((timeInSeconds - (result[1] * 60)) % 60);

		return result;
	}

}
