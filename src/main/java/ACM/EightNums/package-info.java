/**
 * Created with IntelliJ IDEA.
 * User:ChengLiang
 * Date:2017/9/11
 * Time:18:21
 * <p>
 *
 * V1.BFS算法     只能适用于到达目标结点步数较少的情况，如果步数超过15步，运行时间太长，实际上不再起作用。
 *
 * V2.DBFS算法    对于随机生成的同一个可解状态，BFS算法最慢，DBFS算法较慢，A*算法较快。但在15步以内，DBFS算法与A*算法相差时间不大，超过15步后，随步数增加，A*算法的优势就逐渐明显，A*算法要比DBFS算法快5倍以上，并随步数增大而增大。到25步以上，DBFS同样因运行时间过长而失去价值。
 *
 * V3.A*算法      一般来说，解答的移动步数每增加1，程序运行时间就要增加5倍以上。由于八数码问题本身的特点，需要检查的节点随步数增大呈指数形式增加，即使用A*算法，也难解决移动步数更多的问题。
 */
package ACM.EightNums;