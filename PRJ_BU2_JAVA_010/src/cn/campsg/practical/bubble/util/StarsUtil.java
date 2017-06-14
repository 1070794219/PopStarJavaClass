//package cn.campsg.practical.bubble.util;
//
//import cn.campsg.practical.bubble.entity.MovedStar;
//import cn.campsg.practical.bubble.entity.Position;
//import cn.campsg.practical.bubble.entity.Star;
//import cn.campsg.practical.bubble.entity.StarList;
//import cn.campsg.practical.bubble.entity.Star.StarType;
//
///**
// * ������/���ƶ�������ʵ���๤���࣬�ṩ���¹��ܣ�<br>
// * <ul>
// * <li>1. ����ָ���б��е�������-����������������ͬ������������ð�������㷨����</li>
// * <li>2. ��ָ���б��е������ǰ��з��顣</li>
// * <li>3. ��¡һ�������Ƕ���</li>
// * </ul>
// * 
// * @see cn.campsg.practical.bubble.entity.Star
// * @see cn.campsg.practical.bubble.entity.MovedStar
// * 
// * 
// * @author Frank.Chen
// * @version 1.5
// *
// */
//public class StarsUtil {
//	
//	/**
//	 * ����ָ���б��е�������<br>
//	 * ������򣺰������������������ͬ������������<br>
//	 * �����㷨��ð������
//	 * 
//	 * @param starList
//	 *            ��������������б�
//	 */
//	/************ PRJ-BU2-JAVA-010 Task2 ��2/3 start��***************/
//	private static sort(StarList starList){
//		for(int i = 0;i < starList.size() - 1;i++){
//			for(int j = 0;j < starList.size() - i - 1;j++){
//				Star star1 = starList.get(j);
//				Star star2 = starList.get(j + 1);
//				if (star1.getPosition().getRow() > star2.getPosition().getRow()) {
//					swap(star1, star2);
//				}
//			}
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	/************ PRJ-BU2-JAVA-010 Task2 ��2/3 end��*****************/
//	
//	/**
//	 * �����������������б��е�λ��
//	 * 
//	 * @param preStar
//	 *            ��N��������
//	 * @param nextStar
//	 *            ��N+1��������
//	 */
//	/************ PRJ-BU2-JAVA-010 Task1 ��1/3 start��***************/
//	private static void swap(Star preStar,Star nextStar){
//		Star tmpStar = new Star(new Position(preStar.getPosition().getRow(),preStar.getPosition().getColumn()),preStar.getType());
//		preStar.setPosition(new Position(nextStar.getPosition().getRow(),nextStar.getPosition().getColumn()));
//		preStar.setType(nextStar.getType());
//		
//		nextStar.setPosition(new Position(tmpStar.getPosition().getRow(),tmpStar.getPosition().getColumn()));
//		nextStar.setType(tmpStar.getType());
//		
//	}
//
//	public static void main(String[] args) {
//		Star star1 = new Star(new Position(0,0),StarType.BLUE);
//		Star star2 = new Star(new Position(1,1),StarType.GREEN);
//		System.out.println("����ǰ:prestar" + star1.toString() + "nextStar:" + star2.toString());
//		swap(star1, star2);
//		System.out.println("������:prestar" + star1.toString() + "nextStar:" + star2.toString());
//		
//	}
//	
//	
//	
//	
//	
//	
//	/************ PRJ-BU2-JAVA-010 Task1 ��1/3 end��*****************/
//
//	/**
//	 * ��¡һ���µ������ǡ�
//	 * 
//	 * @param star
//	 *            ����¡��������
//	 * @return �µ������ǣ������ڴ��ַ�������ǣ���
//	 */
//	public static Star copy(Star star) {
//
//		Star ret = new Star();
//
//		ret.setPosition(new Position(star.getPosition().getRow(), star
//				.getPosition().getColumn()));
//		ret.setType(star.getType());
//
//		return ret;
//	}
//
//	public static MovedStar toMovedStar(Star star) {
//
//		MovedStar ret = new MovedStar();
//
//		ret.setPosition(new Position(star.getPosition().getRow(), star
//				.getPosition().getColumn()));
//		ret.setType(star.getType());
//
//		return ret;
//	}
//}


package cn.campsg.practical.bubble.util;

import cn.campsg.practical.bubble.entity.MovedStar;
import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.Star.StarType;
import cn.campsg.practical.bubble.entity.StarList;

/**
 * ������/���ƶ�������ʵ���๤���࣬�ṩ���¹��ܣ�<br>
 * <ul>
 * <li>1. ����ָ���б��е�������-����������������ͬ������������ð�������㷨����</li>
 * <li>2. ��ָ���б��е������ǰ��з��顣</li>
 * <li>3. ��¡һ�������Ƕ���</li>
 * </ul>
 * 
 * @see cn.campsg.practical.bubble.entity.Star
 * @see cn.campsg.practical.bubble.entity.MovedStar
 * 
 * 
 * @author Frank.Chen
 * @version 1.5
 *
 */
public class StarsUtil {
	
	/**
	 * ����ָ���б��е�������<br>
	 * ������򣺰������������������ͬ������������<br>
	 * �����㷨��ð������
	 * 
	 * @param starList
	 *            ��������������б�
	 */
	/************ PRJ-BU2-JAVA-010 Task2 ��2/3 start��***************/
	public static void sort(StarList starList){
		for(int i = 0; i < starList.size(); i++){
			for (int j = 0; j < starList.size()-i-1;j++){
				Star preStar = starList.get(j);
				Star nextStar = starList.get(j+1);
				if(preStar.getPosition().getRow() > nextStar.getPosition().getRow()){
					swap(preStar, nextStar);
				}
			}
		}
	}
	
	
	
	
	
	
	
	/************ PRJ-BU2-JAVA-010 Task2 ��2/3 end��*****************/
	
	/**
	 * �����������������б��е�λ��
	 * 
	 * @param preStar
	 *            ��N��������
	 * @param nextStar
	 *            ��N+1��������
	 */
	/************ PRJ-BU2-JAVA-010 Task1 ��1/3 start��***************/
	private static void swap(Star preStar, Star nextStar) {
		Star tempStar = new Star(new Position(preStar.getPosition().getRow(), preStar.getPosition().getColumn()),
				preStar.getType());
		preStar.setPosition(new Position(nextStar.getPosition().getRow(), nextStar.getPosition().getColumn()));
		preStar.setType(nextStar.getType());
		nextStar.setPosition(new Position(tempStar.getPosition().getRow(), tempStar.getPosition().getColumn()));
		nextStar.setType(tempStar.getType());
	}
	public static void main(String[] args) {
		Star star1 = new Star(new Position(0,0),StarType.BLUE);
		Star star2 = new Star(new Position(1,1),StarType.GREEN);
		System.out.println("����ǰ:preStar:"+star1 + "nextStar:" +star2);
		swap(star1, star2);
		System.out.println("������:preStar:"+star1 + "nextStar:" +star2);
	}
	
	
	
	
	
	
	
	/************ PRJ-BU2-JAVA-010 Task1 ��1/3 end��*****************/

	/**
	 * ��¡һ���µ������ǡ�
	 * 
	 * @param star
	 *            ����¡��������
	 * @return �µ������ǣ������ڴ��ַ�������ǣ���
	 */
	public static Star copy(Star star) {

		Star ret = new Star();

		ret.setPosition(new Position(star.getPosition().getRow(), star
				.getPosition().getColumn()));
		ret.setType(star.getType());

		return ret;
	}

	public static MovedStar toMovedStar(Star star) {

		MovedStar ret = new MovedStar();

		ret.setPosition(new Position(star.getPosition().getRow(), star
				.getPosition().getColumn()));
		ret.setType(star.getType());

		return ret;
	}
}