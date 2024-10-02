import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        String[] letters = new String[]{
            "._"  , "A", ".___", "J", "..."  , "S", "..___", "2",
            "_...", "B", "_._" , "K", "_"    , "T", "...__", "3",
            "_._.", "C", "._..", "L", ".._"  , "U", "...._", "4",
            "_.." , "D", "__"  , "M", "..._" , "V", ".....", "5",
            "."   , "E", "_."  , "N", ".__"  , "W", "_....", "6",
            ".._.", "F", "___" , "O", "_.._" , "X", "__...", "7",
            "__." , "G", ".__.", "P", "_.__" , "Y", "___..", "8",
            "....", "H", "__._", "Q", "__.." , "Z", "____.", "9",
            ".."  , "I", "._." , "R", ".____", "1", "_____", "0",
        };

        for (int i = 0 ; i < letters.length ; i+=2) {

            binaryTree.insert(letters[i], letters[i + 1]);

            binaryTree.print(Order.POS_ORDER);
            binaryTree.print(Order.PRE_ORDER);
            binaryTree.print(Order.IN_ORDER);

        }

        if (args.length > 0) {

            if (UseMode.TEXT_TO_TEXT.key == Integer.valueOf(args[0])) {

                String[] morses = Utils.convertText(args[1]);

                for (String morse : morses) {

                    System.out.print(morse + " ");

                }

                System.out.println();

                System.out.println(binaryTree.getCharacter(morses));

            } else if (UseMode.MORSE_TO_TEXT.key == Integer.valueOf(args[0])) {

                System.out.println(
                    binaryTree.getCharacter(
                        Arrays.copyOfRange(
                            args, 
                            1, 
                            args.length
                        )
                    )
                );

            } else if (UseMode.INSERT.key == Integer.valueOf(args[0])) {

                binaryTree.insert(args[1], args[2]);

                System.out.println(binaryTree.getCharacter(args[1]));

            }

        } else {

            System.out.println(
                binaryTree.getCharacter(
                    ".", "._", "...", "_", ".", "._.", "",
                    ".", "__.", "__." 
                )
            );

        }

    }

}
