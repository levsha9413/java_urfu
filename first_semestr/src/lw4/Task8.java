import java.util.Scanner;

/*
8. Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = scanner.next();
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        char[] charArray = text.toCharArray();
        long[] digitArrayForText = new long[charArray.length];
        char[] encryptedCharArray = new char[charArray.length];
        for (int i = 0; i<charArray.length; ++i) {
            digitArrayForText[i] = charArray[i]+key;
            encryptedCharArray[i]=(char) digitArrayForText[i];
        }
        String encryptedText = new String(encryptedCharArray);
        System.out.println("Текст после преобразования:");
        System.out.println(encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.next();
        scanner.close();
        switch (response){
            case  ("y"):
                charArray = encryptedText.toCharArray();
                for (int i = 0; i<charArray.length; ++i) {
                    digitArrayForText[i] = charArray[i]-key;
                    encryptedCharArray[i]=(char) digitArrayForText[i];
                }
                String deincriptedText = new String(encryptedCharArray);
                System.out.println(deincriptedText);
                break;
            case("n"):
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ");

        }


    }

}
