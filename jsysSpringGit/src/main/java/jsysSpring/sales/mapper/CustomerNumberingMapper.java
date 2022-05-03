/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * CustomerNumberingMapper.java
 */
package jsysSpring.sales.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * CUSTOMER_NUMBERINGテーブルを利用するMapperインターフェイス
 * @author FLM
 * @version 1.0 2022/03/20
 */

@Mapper
public interface CustomerNumberingMapper {

	/**
	 * 採番テーブルから得意先コードを取得する。
	 * @return 得意先コード
	 */
	public Integer findCustomerCode();

	/**
	 * 採番テーブルを更新する。
	 * @return 更新結果
	 */
	public int updateCustomerCode();

}
