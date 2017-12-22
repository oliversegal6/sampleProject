
## 安装nodejs

下载Nodejs https://nodejs.org

```
cd /home/oliversegal/Work/node-v8.9.0-linux-x64

sudo cp -r bin/* /usr/local/bin/
sudo cp -r lib/* /usr/local/lib/
sudo cp -r include/* /usr/local/include/

sudo ln -s /usr/local/bin/node /usr/bin/node
sudo ln -s /usr/local/bin/npm /usr/bin/npm

```

## Install Angular
`npm install -g @angular/cli`


## Install Bootstrap

`npm install bootstrap@4.0.0-beta.2`

## Install zTree

### jQuery 冲突
一般需要给新增的jQuery，创建一个新的变量来代替 $ ，这样原先的代码都不需要修改 ）
在存有多种jQuery版本的页面中，如果要正确使用各个版本，就使用var gjq=$.noConflict();为各个版本创建新定义个jQuery引用变量，其实就是创建新的 $ 的代号（简称shortcut）。
在此代码之后，使用原先的jQuery文件的时候，就使用 $ ,(因为在这之前，原先的 $ 存在的环境为正常唯一jQuery环境，而noConflict方法改变是新的jQuery的简称，所以原先的脚本使用 $ 就可以调用)。
请注意，将新添加的jQuery顺序与定义 $ 简称的顺序保持一致!!!!

`var $jq144 = $.noConflict();`

