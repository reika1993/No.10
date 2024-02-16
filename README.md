# 概要

保護ねこと里親をつなぐプログラムを作成します。

## 起動手順

catsテーブルのレコードは以下のとおりです。

```mysql
mysql> select * from cats;
+----+-----------+-----+--------+
| id | name      | age | sex    |
+----+-----------+-----+--------+
|  1 | おもち    |   2 | メス   |
|  2 | コア      |   3 | オス   |
|  3 | ゴンち    |   5 | オス   |
+----+-----------+-----+--------+
3 rows in set (0.00 sec)

```

ポストマンで起動確認をします。

・すべての保護ねこの情報
<img width="1006" alt="All◯" src="https://github.com/reika1993/No.10/assets/150810798/b5e1cff4-d478-436a-bb28-826d45c8be9a">

・名前を検索

＜該当する名前のねこがいるとき＞
<img width="1003" alt="name◯" src="https://github.com/reika1993/No.10/assets/150810798/7c29f62b-91b5-4eed-ab82-166b732928a4">

＜該当する名前のねこがいないとき＞
<img width="1007" alt="name×" src="https://github.com/reika1993/No.10/assets/150810798/8b3aff35-2f7f-4f8a-b7fb-0ac9d59b9901">

・年齢を検索

＜該当の年齢のねこがいるとき＞
<img width="1052" alt="age◯" src="https://github.com/reika1993/No.10/assets/150810798/7f41cfe1-878d-4be2-a6a8-f13bd958ccfd">

＜該当の年齢のねこがいないとき＞
<img width="984" alt="age×" src="https://github.com/reika1993/No.10/assets/150810798/0cf64741-7537-48ec-bb3d-30bc708370c3">

＜オスまたはメスで検索したとき＞
<img width="1041" alt="sex◯" src="https://github.com/reika1993/No.10/assets/150810798/c2aff1b5-1afd-4f1f-9b88-adcf76d8fcce">

＜上記のワード以外で検索したとき＞
<img width="1007" alt="sex×" src="https://github.com/reika1993/No.10/assets/150810798/ce74f319-ee3c-4f7c-8b13-ef2588d05ec7">

完了
