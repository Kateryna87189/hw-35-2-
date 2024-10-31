import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Дан List строк содержащий имена пользователей. Ваша задача написать метод,
который позволит удалить из списка n имен, начиная с заданной позиции i.
Пример:

{Jack, John, Slava, Nick, Lena, Mark} удаляем 2 имени (n=2), начиная с индекса (i=1) получаем: {Jack, Nick, Lena, Mark}
{Jack, John, Slava, Nick, Lena, Mark} удаляем 3 имени (n=3), начиная с индекса (i=4) получаем: {Jack, John, Slava, Nick}
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Margo");
        list.add("Poul");
        list.add("Lukash");
        list.add("Nick");
        list.add("Sandra");
        list.add("Jonatan");
        //видалення 2 імен з списку та відновлення списку
        removeNames(list, 1, 2);
        System.out.println(list);

        //відновлення списку для наступного видалення
        list.clear();
        list.add("Margo");
        list.add("Poul");
        list.add("Lukash");
        list.add("Nick");
        list.add("Sandra");
        list.add("Jonatan");

        removeNames(list, 4, 2);
        System.out.println(list);
    }

    //перевірка параметрів на допустимість
    public static void removeNames(List<String> list, int index, int n) {
        if (index < 0 || index >= list.size() || n < 0 || index + n > list.size()) {
            return;
        }

        // Використання ітератора для видалення елементів
        Iterator<String> iterator = list.iterator();
        int currentIndex = 0;
        while (iterator.hasNext()) {
            iterator.next();
            // Переміщуємось до наступного елементу
            if (currentIndex >= index && currentIndex < index + n) {
                iterator.remove();
                // Видаляємо елемент, якщо він у межах діапазону
            }
            currentIndex++;
        }

    }
}

