public class Main {
    public static void main(String[] args) {
        //Задача №1:переменной dog значение 8.0;
        //переменной cat значение 3.6;
        //переменной paper значение 763789.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Мы где-то взяли всего 8 собак, 3.6(одна без лапы и уха) кошек и ограбили завод по производству бумаги...");
        System.out.println("Собак " + dog);
        System.out.println("Котов " + cat);
        System.out.println("Бумаги " + paper);
        // Задача№2
        var adds = 4;
        dog = dog + adds;
        cat = cat + adds;
        paper = paper + adds;
        System.out.println("Мы где-то взяли всего по 4 штуки");
        System.out.println("Собак " + dog);
        System.out.println("Котов " + cat);
        System.out.println("Бумаги " + paper);
        //Задача №3
        dog = dog + 3.5;
        cat = cat + 1.6;
        paper = paper + 7639;
        System.out.println("К нам прибилось 3 собаки, котопес, 1 кот с лишним хвостом, и канцелярский магазин обнесли...");
        System.out.println("Собак " + dog);
        System.out.println("Котов " + cat);
        System.out.println("Бумаги " + paper);
        //Задача №4
        System.out.print("До всего этого у нас было");
        var friend = 19;
        System.out.println(" " + friend + " друзей.");
        System.out.print("Во время приключений мы встретили еще 2 друга, то-есть сейчас у нас");
        friend = friend + 2;
        System.out.println(" " + friend + " друг.");
        System.out.println("Но позже они узнали что мы за человек....");
        friend = friend / 7;
        System.out.println("Друзей сейчас " + friend + ".");
       //Задача №5
        System.out.print("В конце-концов работа-дом убила нашу дружбу с последними 3-мя друзьями и мы завели ");
        var frog = 3.5;
        System.out.println(" " + frog + " лягух (одна лягуха еще головастик(наверное)).");
        System.out.print("Они быстро размножаются, ведь сейчас у нас ");
        frog = frog * 10;
        System.out.println(frog + " лягух...");
        System.out.println("...и достаточно быстро умирают.");
        frog = frog / 3.5;
        System.out.println("Лягух сейчас " + frog + ".");
        System.out.println("Пока я об этом говорил их уже на 4 больше...");
        frog = frog + 4;
        System.out.println("Их уже " + frog + ".");
        //Задача №6
        System.out.println("В конце-концов с лягухами сложно дружить, и я решил что мне нужно проявить себя чтобы завести друзей, записался на боксюрский поединок...");
        var myWeight = 78.2;
        var opponentWeight = 82.7;
        System.out.println("Я весил " + myWeight + " кг, в то время как мой оппонент весил " + opponentWeight + "кг.");
        var boxersWeight = myWeight + opponentWeight;
        System.out.println("Прикольно, что цифры веса одинаковые и нервничая прикинул, что суммарно наш вес составляет " + boxersWeight + "кг.");
        var diffWeight = opponentWeight-myWeight;
       System.out.println("К стати разница в весе не казалась мне тогда столь значительной " + diffWeight + " кг.");
      // Задача №7
       var ostatok = myWeight%opponentWeight;
        System.out.println("я даже посчитал остаток от деления между нашими весми. Он равен " + ostatok + " кг.");
        System.out.println("Наверное это волнение.");
       //Задача №8
        System.out.println("Пока я лежал в нокауте мне показалось, что я помогал решать домашку сестренке.");
        var totalWork = 640;
        var oneEmployee = 8;
        var staffNeeded = totalWork/oneEmployee;
        System.out.println("Помню, что ответом для первой части задачи было " + staffNeeded + " .");
        var moreEmploee = staffNeeded + 94;
        var workWithMore = moreEmploee * oneEmployee;
        System.out.println("А для второй части задачи ответ был следующим ");
        System.out.println("Если в компании работает " + moreEmploee + " человек, то всего " + workWithMore + " часов работы может быть поделено между сотрудниками.");

    }
    }