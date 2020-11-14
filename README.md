joern - pat
====
- [ ] Foreach
```php
<?php
	$c = $_GET['id'];
	foreach($c as $k => $v) {
			echo $k;
			echo $v;
			echo $c;
	}
```
- 问题： foreach内$k, $v无数据流；$c直接连接到赋值处。
- 方案： $c是0孩子，$v是1孩子，$k是2孩子，stmt是3孩子。 1,2孩子内部建立数据边。
