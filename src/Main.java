import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Player player = new Player(50, 0, 0);
            boolean running = true;
    
            System.out.println("Bem-vindo á floresta infinita!");
            System.out.println("O quão longe consegues chegar?");
    
            while (running) {
                System.out.println("1. Andar");
                System.out.println("2. Ver inventário");
                System.out.println("3. Sair");
    
                int choice = scanner.nextInt();
                scanner.nextLine();
    
                switch (choice) {
                    case 1:
                        System.out.println("Andas-te pelo cenário...");
                        int encounter = (int) (Math.random() * 2);
                        if (encounter == 0) {
                            System.out.println("Encontras-te um monstro!");
                            System.out.println("1. Lutar");
                            System.out.println("2. Fugir");
                            int fightChoice = scanner.nextInt();
                            scanner.nextLine();
                            if (fightChoice == 1) {
                                int damage = (int) (Math.random() * 20);
                                player.setHealth(player.getHealth()-damage);
                                System.out.println("Você sofreu " + damage + " de dano e agora tem " + player.getHealth() + " de saúde");
                                if (player.getHealth() <= 0) {
                                    System.out.println("Morres-te!");
                                    running = false;
                                }
                            } else {
                                if (Math.random() > 0.5) {
                                    System.out.println("Você conseguiu fugir!");
                                } else {
                                    int damage = (int) (Math.random() * 40);
                                    player.setHealth(player.getHealth()-damage);
                                    System.out.println("Tentas-te fugir mas o monstro atacou com " + damage + " de dano e agora tem " + player.getHealth() + " de saúde");
                                    if (player.getHealth() <= 0) {
                                        System.out.println("Morres-te!");
                                        running = false;
                                }
                                }

                            }
                        } else {
                            int goldFound = (int) (Math.random() * 50);
                            player.setGold(player.getGold()+goldFound);
                            System.out.println("Você encontrou " + goldFound + " de ouro e agora tem " + player.getGold() + " de ouro");
                        }
                        //subir nivel
                        player.setLevel(player.getLevel()+1);
                        break;
                    case 2:
                        System.out.println("Saúde: " + player.getHealth());
                        System.out.println("Ouro: " + player.getGold());
                        System.out.println("Nivel: " + player.getLevel());
                        break;
                    case 3:
                        running = false;
                        break;
                    default:

                        break;
                }
            }
    
            System.out.println("Até a próxima vez!");
            scanner.close();
        }
    }

