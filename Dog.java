public class Dog extends Animal {

        int height;
        int witght;
        int age;

        @Override
        String Animal(String name) {
                return "";
        }

        @Override
        void Animal() {

        }

        @Override
        void Animal(int h, int w) {

        }

        @Override
        void Animal(int h) {

        }

        @Override
        //子類別也可以修改父類別所留下來的東西
        //繼承抽象類別後要 透過 覆寫 才能實作(使用)
        public void  move(){
            System.out.println("run///");
        }

        @Override
        String Info() {
                return "";
        }

        @Override
        void sleep() {

        }

        @Override
        String setName(String name) {
                return "";
        }

        @Override
        String getName() {
                return "";
        }

        @Override
        int getNumber() {
                return 0;
        }

        @Override
        void setNunber(int input) {

        }

    //多型，指同一個行為，但有不同的結果


}
