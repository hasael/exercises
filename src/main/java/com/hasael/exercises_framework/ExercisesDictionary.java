package com.hasael.exercises_framework;

import com.hasael.exercises_framework.common.Exercise;
import com.hasael.exercises_framework.solutions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExercisesDictionary {

    public static List<Exercise> EXERCISES = Arrays.asList(
            new Exercise(
                    "hello_world",
                    "Display hello world every time",
                    Arrays.asList("first", "second"),
                    Arrays.asList("hello world", "hello world"),
                    x -> new HelloWorld().solution(x)),
            new Exercise(
                    "Add two numbers as a linked list",
                    "You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.",
                    Arrays.asList(Arrays.asList(new LinkedList<Integer>(Arrays.asList(2, 4, 3)), new LinkedList<Integer>(Arrays.asList(5, 6, 4)))),
                    Arrays.asList(new LinkedList(Arrays.asList(7, 0, 8))),
                    x -> new Add_Two_Numbers_As_LinkedList().solution(x)),
            new Exercise(
                    "Longest Substring Without Repeating Characters",
                    "Given a string, find the length of the longest substring without repeating characters. Here is an example solution in Python language.",
                    Arrays.asList("abrkaabcdefghijjxxx"),
                    Arrays.asList(10),
                    x -> new Longest_Substring_Without_Repeating_Characters().solution(x)),
            new Exercise(
                    "Longest Palindromic Substring",
                    "A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the longest palindromic substring in s.",
                    Arrays.asList("banana", "million"),
                    Arrays.asList("anana", "illi"),
                    x -> new Longest_Palindromic_Substring().solution(x)),
            new Exercise(
                    "Counting Valleys",
                    "Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. ",
                    Arrays.asList("UDDDUDUU", "DDUUUUDD", "DUUUDUDDUDDU"),
                    Arrays.asList(1, 1, 2),
                    x -> new Counting_Valleys().solution(x)),

            new Exercise(
                    "Jumping on the Clouds",
                    "Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.",
                    Arrays.asList(new int[]{0, 1, 0, 0, 0, 1, 0},
                            new int[]{0, 0, 1, 0, 0, 1, 0},
                            new int[]{0, 0, 0, 0, 1, 0}),
                    Arrays.asList(3, 4, 3),
                    x -> new Jumping_Clouds().solution(x)),
            new Exercise(
                    "Repeated String",
                    "Lilah has a string, , of lowercase English letters that she repeated infinitely many times.\n" +
                            "\n" +
                            "Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.\n" +
                            "\n" +
                            "For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.",
                    Arrays.asList(Arrays.asList("aba", 10L), Arrays.asList("abcac", 10L), Arrays.asList("a", 1000L)),
                    Arrays.asList(7L, 4L, 1000L),
                    x -> new Repeated_String().solution(x)),
            new Exercise(
                    "2D Array - DS",
                    "Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.\n" +
                            "\n" +
                            "hourglassSum has the following parameter(s):\n" +
                            "\n" +
                            "arr: an array of integers",
                    Arrays.asList(
                            new int[][]{
                                    {1, 1, 1, 0, 0, 0},
                                    {0, 1, 0, 0, 0, 0},
                                    {1, 1, 1, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0}
                            },
                            new int[][]{
                                    {-9, -9, -9, 1, 1, 1},
                                    {0, -9, 0, 4, 3, 2},
                                    {-9, -9, -9, 1, 2, 3},
                                    {0, 0, 8, 6, 6, 0},
                                    {0, 0, 0, -2, 0, 0},
                                    {0, 0, 1, 2, 4, 0}
                            }),
                    Arrays.asList(7, 28),
                    x -> new TWOD_Array_DS().solution(x)),
            new Exercise(
                    "New Year Chaos",
                    "It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.",
                    Arrays.asList(new int[]{2, 1, 5, 3, 4}, new int[]{2, 5, 1, 3, 4},
                            new int[]{2, 4, 5, 1, 3, 8, 9, 10, 6, 7, 13, 12, 14, 11, 16, 18, 15, 17, 19, 22, 20, 21, 23, 26, 25, 28, 24, 27, 30, 32, 29, 34, 31, 35, 33, 37, 36, 39, 41, 38, 42, 43, 40, 45, 44, 48, 46, 47, 51, 50, 49, 53, 54, 52, 55, 57, 56, 60, 59, 58, 61, 64, 63, 62, 67, 66, 65, 70, 69, 68, 71, 74, 73, 72, 77, 76, 79, 78, 75, 80, 82, 81, 85, 83, 84, 87, 86, 89, 90, 88, 91, 94, 92, 93, 95, 98, 97, 100, 96, 102, 101, 99, 103, 105, 104, 107, 106, 110, 108, 112, 109, 111, 113, 116, 114, 115, 118, 117, 119, 121, 123, 120, 122, 124, 127, 125, 126, 130, 128, 132, 133, 129, 131, 135, 134, 137, 136, 139, 138, 140, 143, 141, 145, 142, 144, 146, 147, 148, 150, 149, 153, 151, 152, 156, 155, 154, 159, 157, 160, 158, 162, 164, 161, 165, 167, 163, 166, 169, 168, 172, 170, 171, 173, 174, 176, 177, 175, 180, 178, 182, 181, 183, 179, 184, 186, 185, 189, 188, 187, 190, 191, 194, 192, 195, 193, 197, 196, 200, 199, 198, 202, 203, 201, 204, 206, 208, 205, 210, 207, 209, 211, 213, 215, 212, 217, 216, 214, 219, 220, 221, 218, 222, 224, 226, 227, 223, 225, 230, 229, 228, 231, 233, 232, 235, 234, 238, 237, 236, 240, 239, 243, 242, 244, 241, 245, 246, 249, 248, 247, 250, 253, 251, 252, 254, 255, 257, 256, 258, 261, 259, 260, 263, 265, 262, 266, 264, 268, 269, 267, 272, 270, 274, 273, 271, 275, 276, 277, 278, 279, 282, 280, 283, 281, 284, 285, 287, 286, 288, 290, 289, 293, 294, 295, 291, 292, 297, 299, 296, 298, 302, 301, 300, 305, 304, 303, 308, 306, 310, 309, 307, 313, 311, 315, 312, 314, 317, 316, 319, 320, 318, 321, 322, 324, 323, 325, 327, 326, 330, 329, 328, 331, 333, 332, 334, 337, 336, 335, 339, 340, 338, 342, 341, 345, 344, 343, 348, 349, 347, 346, 351, 353, 350, 354, 355, 352, 357, 356, 359, 358, 362, 360, 361, 363, 364, 365, 366, 367, 370, 369, 368, 371, 374, 372, 373, 376, 378, 375, 379, 377, 381, 383, 382, 385, 380, 386, 387, 384, 390, 389, 388, 393, 391, 395, 394, 392, 397, 396, 399, 400, 401, 403, 398, 402, 406, 407, 405, 409, 408, 411, 404, 413, 410, 415, 414, 412, 418, 417, 416, 419, 422, 420, 424, 423, 425, 421, 428, 429, 430, 431, 426, 427, 432, 435, 434, 433, 438, 436, 440, 437, 439, 443, 442, 441, 445, 444, 447, 446, 449, 448, 450, 452, 451, 455, 453, 454, 456, 459, 458, 457, 461, 462, 460, 464, 463, 466, 465, 467, 469, 468, 470, 472, 471, 475, 473, 474, 476, 477, 479, 478, 482, 480, 481, 484, 485, 486, 483, 488, 487, 491, 490, 489, 494, 492, 496, 493, 495, 497, 499, 500, 501, 498, 503, 502, 506, 504, 507, 505, 510, 508, 509, 512, 511, 513, 514, 516, 515, 517, 518, 519, 520, 521, 524, 523, 522, 525, 526, 527, 530, 528, 529, 531, 533, 532, 536, 534, 537, 535, 538, 539, 540, 542, 543, 545, 544, 541, 547, 546, 549, 548, 551, 550, 553, 552, 556, 555, 558, 554, 557, 559, 561, 562, 560, 564, 563, 565, 568, 567, 566, 570, 572, 569, 573, 571, 575, 574, 577, 579, 576, 581, 578, 580, 584, 583, 585, 582, 587, 586, 588, 589, 591, 590, 594, 593, 592, 596, 597, 595, 600, 599, 598, 603, 602, 601, 604, 606, 608, 605, 609, 610, 607, 612, 613, 615, 611, 614, 618, 616, 617, 619, 621, 623, 622, 620, 624, 626, 625, 627, 629, 628, 630, 632, 631, 635, 633, 634, 637, 638, 636, 641, 639, 640, 643, 642, 645, 644, 648, 647, 646, 650, 649, 653, 651, 652, 654, 655, 656, 657, 660, 659, 658, 661, 664, 663, 666, 667, 662, 665, 670, 668, 672, 673, 669, 671, 676, 674, 675, 677, 678, 681, 679, 682, 683, 685, 684, 680, 688, 686, 689, 691, 687, 690, 692, 693, 695, 696, 694, 697, 699, 701, 698, 700, 703, 705, 706, 702, 704, 708, 707, 710, 709, 711, 713, 712, 715, 714, 716, 717, 720, 718, 721, 722, 719, 723, 724, 725, 726, 727, 730, 729, 731, 728, 733, 735, 736, 734, 732, 738, 737, 739, 740, 743, 742, 741, 744, 747, 745, 746, 750, 748, 752, 749, 751, 753, 755, 754, 757, 756, 759, 760, 758, 762, 761, 764, 763, 766, 765, 767, 770, 769, 768, 773, 771, 772, 774, 777, 776, 779, 775, 780, 782, 781, 778, 784, 786, 783, 788, 785, 787, 789, 791, 790, 794, 792, 796, 793, 798, 799, 797, 795, 802, 803, 801, 800, 804, 806, 808, 805, 807, 809, 811, 812, 810, 815, 813, 814, 818, 816, 817, 819, 822, 820, 823, 821, 826, 825, 824, 827, 828, 829, 830, 831, 833, 832, 834, 837, 835, 836, 838, 840, 839, 843, 841, 844, 842, 847, 845, 848, 846, 850, 849, 853, 851, 854, 852, 857, 856, 855, 860, 858, 862, 859, 864, 861, 863, 866, 865, 869, 867, 871, 868, 870, 874, 872, 875, 877, 873, 879, 880, 876, 878, 883, 881, 884, 885, 882, 888, 887, 890, 886, 889, 893, 891, 895, 892, 896, 894, 897, 899, 898, 901, 900, 903, 902, 905, 906, 907, 904, 910, 908, 911, 909, 913, 912, 916, 915, 914, 918, 917, 920, 921, 919, 924, 923, 922, 926, 925, 928, 927, 930, 929, 932, 931, 935, 933, 934, 937, 936, 938, 939, 942, 941, 940, 943, 944, 947, 945, 948, 949, 946, 952, 950, 951, 955, 954, 953, 957, 956, 960, 958, 962, 959, 964, 965, 961, 963, 968, 969, 966, 967, 972, 970, 971, 973, 974, 975, 977, 976, 979, 980, 978, 982, 981, 983, 984, 986, 985, 987, 988, 991, 989, 992, 990, 993, 996, 994, 998, 995, 997}),
                    Arrays.asList(3, -1, 704),
                    x -> new New_Year_Chaos().solution(x)),
            new Exercise(
                    "Minimum Swaps 2\n",
                    "You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.",
                    Arrays.asList(new int[]{7, 1, 3, 2, 4, 5, 6}, new int[]{4, 3, 1, 2}, new int[]{2, 3, 4, 1, 5},
                            new int[]{1, 3, 5, 2, 4, 6, 7}),
                    Arrays.asList(5, 3, 3, 3),
                    x -> new Minimum_Swaps().solution(x))

    );
}
