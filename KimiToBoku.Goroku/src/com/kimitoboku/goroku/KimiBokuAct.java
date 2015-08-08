package com.kimitoboku.goroku;

import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.media.SoundPool;
import android.media.AudioManager;


public class KimiBokuAct extends Activity {
	private final static int WC = RelativeLayout.LayoutParams.WRAP_CONTENT;
	private String[] shu = {"大凶ーーーっっ\n　　　　　　　　　　　　　　　<1巻>","見ちゃダメですーーーっっ\n　　　　　　　　　　　　　　　<1巻>","（雑誌のために動いたんだ！）\n　　　　　　　　　　　　　　　<1巻>","ボクが許しません！\n　　　　　　　　　　　　　　　<1巻>","おいしくできるといいですねー\n　　　　　　　　　　　　　　　<2巻>","残念賞ということで\n　　　　　　　　　　　　　　　<2巻>","ブラックジャックはお医者さんです！！\n　　　　　　　　　　　　　　　<3巻>","きっとラブレターって\n何度も書き直すんでしょうねー\n　　　　　　　　　　　　　　　<4巻>","ってあ”！\nちょっとダメですよ千鶴くん\n　　　　　　　　　　　　　　　<4巻>","ボクは千鶴くんと\n一緒に行きたいんですよ？\n　　　　　　　　　　　　　　　<4巻>","え”ーっっ！！？ちょっとま・・・っ\nなんでなんでなんで\n　　　　　　　　　　　　　　　<4巻>","そうだね冬樹このままだったら\n嫌われちゃうかもしれないね\n　　　　　　　　　　　　　　　<5巻>","完・・・・・・・え？\n何がですか？\n　　　　　　　　　　　　　　　<5巻>","ボクこんなゆびずもう\n見たことないです・・・\n　　　　　　　　　　　　　　　<6巻>","じゃあ今日のお昼休憩\nみんなでチョコ食べましょうか\n　　　　　　　　　　　　　　　<6巻>","ちちちちがっ\nこれは　あのっ\n　　　　　　　　　　　　　　　<6巻>","おつきあいは・・・できません：\n　　　　　　　　　　　　　　　<6巻>","ヒーローピンク！\n　　　　　　　　　　　　　　　<6巻>","なんでよその家の麦茶って\n味がちがうんでしょうねー\n　　　　　　　　　　　　　　　<7巻>","みんなまで\nスケベなことばっかり考えて・・・！！\n　　　　　　　　　　　　　　　<7巻>","ふゆきーーーーっっ\n　　　　　　　　　　　　　　　<7巻>","千鶴くんが何か\nビンカンになってるんですけど\n　　　　　　　　　　　　　　　<7巻>","え～～～～～～ムリですよ\nボクすごいオンチですもん～～～\n　　　　　　　　　　　　　　　<8巻>","大変結構です\n　　　　　　　　　　　　　　　<9巻>","ブラボーーーーー！！\n　　　　　　　　　　　　　　　<9巻>","ボクは楽しいです\n　　　　　　　　　　　　　　　<10巻>","そんないい加減な気持ちで\nボクは想ってたわけじゃない！\n　　　　　　　　　　　　　　　<10巻>","あきらさん\n何言ってるんですか。\n　　　　　　　　　　　　　　　<10巻>","でもきっと　勝っても負けても\n楽しい一日になりますよ\n　　　　　　　　　　　　　　　<11巻>","そういうのわからないんですよ\nさらさらストレートの人は！\n　　　　　　　　　　　　　　　<11巻>","何見ます！？何見ます！？\n　　　　　　　　　　　　　　　<11巻>","だめですよ！カメラで太陽を\n直接のぞいたらだめだって・・・！\n　　　　　　　　　　　　　　　<12巻>","そっかー\n茉咲ちゃん好きな人がいるんだーー\n　　　　　　　　　　　　　　　<13巻>","髪濡れちゃいますよ\n　　　　　　　　　　　　　　　<13巻>","あのっ　要くんのがよっぽどわかりやすく\n悩みを解決してくれますから！\n　　　　　　　　　　　　　　　<13巻>"};
	private String[] kan = {"単にお前が人の話きいてねえだけだ\n　　　　　　　　　　　　　　　<1巻>","よし祐希お前今スグ部活に入れ\n今帰宅部だろ\n　　　　　　　　　　　　　　　<1巻>","オレだってしたかねーけど！！\n　　　　　　　　　　　　　　　<1巻>","そこで嘔吐する理由がわからん\n　　　　　　　　　　　　　　　<1巻>","・・・むしろお前こそふわふわする\nその脳みそをどーにかしたらどうだ\n　　　　　　　　　　　　　　　<1巻>","むしろお前が病院行け。\nニブすぎる。\n　　　　　　　　　　　　　　　<2巻>","お前らも天才だけどな\nアホの。\n　　　　　　　　　　　　　　　<3巻>","・・・オイ\nお前スカートの中見せろ\n　　　　　　　　　　　　　　　<3巻>","・・・ちったあ自分で考えろ\n　　　　　　　　　　　　　　　<3巻>","あきらめろ\n　　　　　　　　　　　　　　　<3巻>","おっ前へたすりゃ\n告白で人殺せるんじゃねーの・・・？\n　　　　　　　　　　　　　　　<4巻>","ヒマしてたのはお前らだけだ\n　　　　　　　　　　　　　　　<4巻>","あ”！？アキレス腱がなんだって！？\n　　　　　　　　　　　　　　　<4巻>","あーはいはい　じゃせーぜー\n濡れて帰れ　じゃあな\n　　　　　　　　　　　　　　　<5巻>","卒業してねじゃねえか。\n　　　　　　　　　　　　　　　<5巻>","お前はそいつの母ちゃんか\n　　　　　　　　　　　　　　　<6巻>","せっかくだからもうちょっと遊んでこーぜ\n　　　　　　　　　　　　　　　<6巻>","あ”ーーーーーなんでもねえ\nなんでもねえなんでもねえ！！\n　　　　　　　　　　　　　　　<6巻>","ヒーローブラック！\n　　　　　　　　　　　　　　　<6巻>","そんなにがんばってないですから！\n　　　　　　　　　　　　　　　<7巻>","ウーロン茶一つでそこまで話盛り上がれる\nお前らの理解に苦しむわ\n　　　　　　　　　　　　　　　<7巻>","え？なんの裏だって？？\n　　　　　　　　　　　　　　　<7巻>","祐希　小ザル\nまてゴラァーーー！！！\n　　　　　　　　　　　　　　　<7巻>","でもってなんだ　でもって！！\nもっぺん言っ・・・\n　　　　　　　　　　　　　　　<8巻>","お前らどんだけ食うんだよ人ん家で\n　　　　　　　　　　　　　　　<8巻>","じゃあいっそお前らが星になれよ\n　　　　　　　　　　　　　　　<8巻>","結婚てなんだよ・・・\n　　　　　　　　　　　　　　　<8巻>","こ・・・っ　は！！？\nお　お前何言って\n　　　　　　　　　　　　　　　<8巻>","和菓子目当てはお前らだろうが\n　　　　　　　　　　　　　　　<9巻>","こいつが筋トレしたら\n合成写真じゃねえか\n　　　　　　　　　　　　　　　<9巻>","じゃあもうアホの比率もn７対３で分けてろよお前らは。\n　　　　　　　　　　　　　　　<10巻>","「因果応報」\n　　　　　　　　　　　　　　　<10巻>","よお赤組改め赤っ恥組\n　　　　　　　　　　　　　　　<11巻>","いやだってお前それ\nカリフラワーじゃねえかよ頭もう\n　　　　　　　　　　　　　　　<11巻>","かすっ・・・ったよな・・・？\n　　　　　　　　　　　　　　　<11巻>","お前の住んでるお花畑には\nカーネーション咲いてなかったんだ\n　　　　　　　　　　　　　　　<11巻>","昔っからお前の髪型は\nだいたいこんな・・・\n　　　　　　　　　　　　　　　<12巻>","何やってんだよもおおおおお\n　　　　　　　　　　　　　　　<12巻>","死んじゃえだわ・・・\nほんとに・・・・\n　　　　　　　　　　　　　　　<12巻>","ったくせっかく\nきれいにしてんのに・・・\n　　　　　　　　　　　　　　　<12巻>","こんなとこにいんの誰かに見られたら\n恥ずかしすぎて死ぬわ！\n　　　　　　　　　　　　　　　<13巻>","戻れるか！！！\n　　　　　　　　　　　　　　　<13巻>","どんどん卑屈になってんぞ\n　　　　　　　　　　　　　　　<13巻>","えーー？\n高校戦隊も忙しいのー\n　　　　　　　　　　　　　　　<13巻>","おい　名前しらねえぞこいつ\n　　　　　　　　　　　　　　　<13巻>"};
	private String[] yut = {"無防備すぎ\n　　　　　　　　　　　　　　　<1巻>","ん？全然少しでしょ\n　　　　　　　　　　　　　　　<1巻>","いやちょっと確認を\n　　　　　　　　　　　　　　　<1巻>","・・・早いよ返答が\n　　　　　　　　　　　　　　　<2巻>","オレはちゃんと女じゃないと言いました。\n　　　　　　　　　　　　　　　<2巻>","価値観っていうのは人それぞれなんだよ\n　　　　　　　　　　　　　　　<2巻>","要は全力でやって\nこの結果なんだから\n　　　　　　　　　　　　　　　<2巻>","今度そのCD貸し・・・ます\n　　　　　　　　　　　　　　　<3巻>","どこのドラ息子ですか\n　　　　　　　　　　　　　　　<3巻>","要　乱視でしょ？\nたくさんあるように見えてたんだよ\n　　　　　　　　　　　　　　　<4巻>","そうだね\n春自体がちょっとファンタジーだもんね\n　　　　　　　　　　　　　　　<5巻>","おおみそかはどこの家も忙しいんだから\n遅くまでたら迷惑でしょ？\n　　　　　　　　　　　　　　　<5巻>","春どこの女子高生？\n　　　　　　　　　　　　　　　<6巻>","自分が決めないといけないことは\nちゃんと自分で考えるよ　春は\n　　　　　　　　　　　　　　　<6巻>","ヒーローブルー！\n　　　　　　　　　　　　　　　<6巻>","・・・なんでオレの耳たぶつかうの\n　　　　　　　　　　　　　　　<7巻>","いや祐希が何オレたちの\nとこもってきちゃってんの？\n　　　　　　　　　　　　　　　<7巻>","オレたちのバレーはギャグなんじゃない？\n　　　　　　　　　　　　　　　<8巻>","してないよ・・・ていうか\nいいじゃないすか今その話は・・・\n　　　　　　　　　　　　　　　<8巻>","いや目を真っ赤にして怒ってる\n要しか見たことないです・・・\n　　　　　　　　　　　　　　　<8巻>","お服加減はいかがですか？\n　　　　　　　　　　　　　　　<9巻>","うちの子たちまだ\n電車にすら乗ってないみたいです・・・\n　　　　　　　　　　　　　　　<9巻>","いや金閣寺より輝いているでしょう・・・\n　　　　　　　　　　　　　　　<9巻>","すいませんどの日々に戻ってみても\n勉強している千鶴くんが\nいないんですけど\n　　　　　　　　　　　　　　　<10巻>","まあ春が棒倒しに出たら\n棒より先に春が倒されるだろうね\nまちがいなく\n　　　　　　　　　　　　　　　<10巻>","かっこいいよ祐希\n　　　　　　　　　　　　　　　<11巻>","いや今一番酷いの春\n　　　　　　　　　　　　　　　<11巻>","いいよ　おごったげる\n　　　　　　　　　　　　　　　<12巻>","・・・いや？\nべつに大したことは・・・\n　　　　　　　　　　　　　　　<12巻>","ほんとに勉強してたらね。\n　　　　　　　　　　　　　　　<12巻>","何してたと思う？\n　　　　　　　　　　　　　　　<13巻>","・・・かっこいいなー要くんは\n　　　　　　　　　　　　　　　<13巻>","ていうか日陰者ですよオレたちなんか\n　　　　　　　　　　　　　　　<13巻>","千鶴んちってどこ？\n　　　　　　　　　　　　　　　<13巻>","そりゃ間違えるよなあって言ったの\n　　　　　　　　　　　　　　　<13巻>"};
	private String[] yuk = {"ただ誰の言葉も\nオレの中にまで響かないだけで・・・\n　　　　　　　　　　　　　　　<1巻>","これ老後の健康を考えるといいかもね\n　　　　　　　　　　　　　　　<1巻>","見なくても育っていけますから。\nおきづかいなく。\n　　　　　　　　　　　　　　　<2巻>","どちら様ですか？\n　　　　　　　　　　　　　　　<2巻>","彼の中の妄想の中では\n昔の知り合いらしいです\n　　　　　　　　　　　　　　　<2巻>","なぜならオレには今\n救わなければならない\n人々が大勢いるからさ\n　　　　　　　　　　　　　　　<2巻>","見て　茉咲が流れてく\n　　　　　　　　　　　　　　　<2巻>","なんで千鶴ボロボロなの？\n　　　　　　　　　　　　　　　<2巻>","殺られる前に殺る\nそれだけの話さ\n　　　　　　　　　　　　　　　<2巻>","昨日こく・・・\nごじてん誰か勝手にもってったの？\n　　　　　　　　　　　　　　　<3巻>","なんて地球にきびしい・・・\n　　　　　　　　　　　　　　　<3巻>","いやそうじゃなくて\nうちの父さん本格的に目なんで\n　　　　　　　　　　　　　　　<3巻>","うわ・・・ひっど一人一人がなけなしの\n２５円をはたいて買ったあんぱんなのに\n　　　　　　　　　　　　　　　<4巻>","ふえっくしょん\n　　　　　　　　　　　　　　　<4巻>","それはちょっと・・・\n犯罪になるんで・・・\n　　　　　　　　　　　　　　　<4巻>","お皿つかってください\n　　　　　　　　　　　　　　　<4巻>","・・・千鶴さん余裕で\nワンシーズンすっとばしましたけ\n　　　　　　　　　　　　　　　<5巻>","あーーー悠太たれてるたれてる\n　　　　　　　　　　　　　　　<5巻>","やだもうここの家の子になる\n　　　　　　　　　　　　　　　<5巻>","うわこの人もむとか言ってるやらしー\n　　　　　　　　　　　　　　　<6巻>","そういう女ゴコロがわからんから\n君はいつまでたっても子供なんだよ\n　　　　　　　　　　　　　　　<6巻>","愛しのメリーちゃんと\n　　　　　　　　　　　　　　　<6巻>","ヒーローベージュ！\n　　　　　　　　　　　　　　　<6巻>","いやだからね　初体験っていうのは\nキスのことじゃなくてセッ\n　　　　　　　　　　　　　　　<7巻>","されてないから\nされてません。\n　　　　　　　　　　　　　　　<7巻>","東晃一\nこの貼る結婚します！\n　　　　　　　　　　　　　　　<7巻>","オレはここでふみとどまるから\n要の二の舞いには絶対ならないから\n　　　　　　　　　　　　　　　<8巻>","要そういうのが\n熟年離婚につながっていくんだよ\n　　　　　　　　　　　　　　　<8巻>","要は涙なんかながさないでしょ？\n　　　　　　　　　　　　　　　<8巻>","「わけろ整髪？」\n　　　　　　　　　　　　　　　<9巻>","わかったこれ十先生の実家じゃない？\n　　　　　　　　　　　　　　　<9巻>","お命ちょうだーーーい\n　　　　　　　　　　　　　　　<9巻>","？肩幅\n測るんじゃないの？\n　　　　　　　　　　　　　　　<10巻>","・・・全然雨振りそうじゃないじゃん\n　　　　　　　　　　　　　　　<10巻>","千鶴今の発言はだめ。セクハラ。\n　　　　　　　　　　　　　　　<10巻>","・・・すけべ\n　　　　　　　　　　　　　　　<11巻>","ちょっと今日要いないんじゃなんのために\nオレ１３年要と一緒にいたの？\n　　　　　　　　　　　　　　　<11巻>","これ要にやらせたほうがいいよね\nこういうので\nイライラを発散していただかないとだよ\n　　　　　　　　　　　　　　　<11巻>","さーーて\nオレは73番買おっかなーー\n　　　　　　　　　　　　　　　<12巻>","まあ肩じゃなくてもいいなら\n喜んでたたかせてもらいますけど・・・\n　　　　　　　　　　　　　　　<12巻>","足すべっちゃった☆\nプールサイド濡れてて滑っちゃった☆\n　　　　　　　　　　　　　　　<12巻>","日陰にいればいいんだよ\nオレたちみたいな貧乏学生\n　　　　　　　　　　　　　　　<13巻>","つーかはーらさんっ\n　　　　　　　　　　　　　　　<13巻>","いや\n悠太の手だなあって\n　　　　　　　　　　　　　　　<13巻>"};
	private String[] chi = {"うおっクローン！！？\n　　　　　　　　　　　　　　　<2巻>","あの子どっちかの彼女？\n　　　　　　　　　　　　　　　<2巻>","オレって実は架空の人物なのかな・・・\n　　　　　　　　　　　　　　　<2巻>","何　何！？彼女！？\n　　　　　　　　　　　　　　　<2巻>","１分！１分でいので話だけでも！！\n　　　　　　　　　　　　　　　<2巻>","オレに近寄るとやけどするぜ！？\n　　　　　　　　　　　　　　　<2巻>","ふられんぼう将軍！\n　　　　　　　　　　　　　　　<3巻>","みなさんっ\nニューヨークへ行きたいですかー！？\n　　　　　　　　　　　　　　　<3巻>","ほんっと失礼だな君たちは・・・\n　　　　　　　　　　　　　　　<4巻>","オレの好きな人は春ちゃんでーい！\n　　　　　　　　　　　　　　　<4巻>","ケアレ＝スミスって誰？\n　　　　　　　　　　　　　　　<4巻>","うーんファーストキスはレモン味かな☆","このけだものー！！\n　　　　　　　　　　　　　　　<5巻>","みんな彼女いないんだからさあああ！！\n朝まで抱きしめてくれよおお！！\n　　　　　　　　　　　　　　　<5巻>","つまり彼女と\nけんたい期ってことですか？\n　　　　　　　　　　　　　　　<6巻>","メリー大丈夫だって\n　　　　　　　　　　　　　　　<6巻>","ゆっきーは\n好きになっちゃだめだかんな！？\n　　　　　　　　　　　　　　　<6巻>","オレメリーが好き\n　　　　　　　　　　　　　　　<6巻>","ヒーローイエロー！\n　　　　　　　　　　　　　　　<6巻>","東先生きらい？\n　　　　　　　　　　　　　　　<7巻>","オイこらエロ助！！\n　　　　　　　　　　　　　　　<7巻>","おおおおお\nすげえこれポラロイドだーーー！！\n　　　　　　　　　　　　　　　<7巻>","なにふらふらしてんだよメリー\nだいじょぶか？\n　　　　　　　　　　　　　　　<7巻>","春ちゃん！\nオレの頭ポニーテールにして！\n　　　　　　　　　　　　　　　<8巻>","・・・おどらされてんじゃねえよ\nおめえら\n　　　　　　　　　　　　　　　<8巻>","スポーツってのはここを使うんだよ\nこ・こ\n　　　　　　　　　　　　　　　<8巻>","たのんますえ塚原は～～～ん\n　　　　　　　　　　　　　　　<9巻>","見よ！この肉体美！\n　　　　　　　　　　　　　　　<9巻>","てめえらは\n地獄に落ちろーーーー！！！！\n　　　　　　　　　　　　　　　<9巻>","新選組ラーメン・・・\n　　　　　　　　　　　　　　　<9巻>","・・・メリーーーィ\nだいすき\n　　　　　　　　　　　　　　　<9巻>","だから誰がカツラじゃごらあ！！\n　　　　　　　　　　　　　　　<10巻>","はいはい浅羽くんが\nやったらいいと思いまーす\n　　　　　　　　　　　　　　　<10巻>","く～～～っ\n夏服がまぶしいぜ～～っ\n　　　　　　　　　　　　　　　<10巻>","ゆっきいいいーーーーーーーー！！！\n　　　　　　　　　　　　　　　<11巻>","おおーーっ\nチアガールがいっぱいだーーっ\n　　　　　　　　　　　　　　　<11巻>","チアガール超かわいかったぞ！\n　　　　　　　　　　　　　　　<11巻>","すいへーりーべーぼくのふ\n　　　　　　　　　　　　　　　<12巻>","ちょいと梅坊よ\n　　　　　　　　　　　　　　　<12巻>","でたでたおじいちゃんチーム！\n　　　　　　　　　　　　　　　<13巻>","はっ　暑さ凌ぎたきゃ\n日陰で十分なんだよ日陰で\n　　　　　　　　　　　　　　　<13巻>","ゆうたんゲーム下手すぎ～～～！！\n　　　　　　　　　　　　　　　<13巻>"};
	private Random rnd = new Random();
	private SoundPool SE;
	private int se;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		RelativeLayout relativeLayout = new RelativeLayout(this);
		setContentView(relativeLayout);
		RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(WC,WC);
		params0.setMargins(0,0,0,0);
		RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(WC,WC);
		params1.setMargins(20,680,0,0);
		RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(WC,WC);
		params2.setMargins(500,680,0,0);
		RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(WC,WC);
		params3.setMargins(20,320,0,0);
		RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(WC,WC);
		params4.setMargins(500,320,0,0);
		RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(WC,WC);
		params5.setMargins(260,500,0,0);

		SE = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
		se = SE.load(getApplicationContext(),R.raw.se01,1);


		final ImageButton logo = new ImageButton(this);
		logo.setImageResource(R.drawable.bt_logo);
		logo.setPadding(0,0,0,0);

		relativeLayout.addView(logo,params0);

		final ImageButton shun = new ImageButton(this);
		shun.setImageResource(R.drawable.bt_shun);
		shun.setPadding(0,0,0,0);
		shun.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				int ran = rnd.nextInt(34);
				SE.play(se,1.0F, 1.0F, 0, 0, 1.0F);
				Toast ts1 = Toast.makeText(KimiBokuAct.this,shu[ran],Toast.LENGTH_LONG);
				ts1.setGravity(Gravity.BOTTOM, 0, 0);
				ts1.show();
			}

		});
		relativeLayout.addView(shun,params1);

		final ImageButton kaname = new ImageButton(this);
		kaname.setImageResource(R.drawable.bt_kaname);
		kaname.setPadding(0,0,0,0);
		kaname.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				int ran = rnd.nextInt(44);
				SE.play(se,1.0F, 1.0F, 0, 0, 1.0F);
				Toast ts2 = Toast.makeText(KimiBokuAct.this, kan[ran],Toast.LENGTH_LONG);
				ts2.setGravity(Gravity.BOTTOM, 0, 0);
				ts2.show();
			}

		});
		relativeLayout.addView(kaname,params2);

		final ImageButton yuta = new ImageButton(this);
		yuta.setImageResource(R.drawable.bt_yuta);
		yuta.setPadding(0,0,0,0);
		yuta.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				int ran = rnd.nextInt(34);
				SE.play(se,1.0F, 1.0F, 0, 0, 1.0F);
				Toast ts3 = Toast.makeText(KimiBokuAct.this, yut[ran],Toast.LENGTH_LONG);
				ts3.setGravity(Gravity.BOTTOM, 0, 0);
				ts3.show();
			}

		});
		relativeLayout.addView(yuta,params3);

		final ImageButton yuki = new ImageButton(this);
		yuki.setImageResource(R.drawable.bt_yuki);
		yuki.setPadding(0,0,0,0);
		yuki.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				int ran = rnd.nextInt(42);
				SE.play(se,1.0F, 1.0F, 0, 0, 1.0F);
				Toast ts4 = Toast.makeText(KimiBokuAct.this, yuk[ran],Toast.LENGTH_LONG);
				ts4.setGravity(Gravity.BOTTOM, 0, 0);
				ts4.show();
			}

		});
		relativeLayout.addView(yuki,params4);

		final ImageButton chizuru = new ImageButton(this);
		chizuru.setImageResource(R.drawable.bt_chizuru);
		chizuru.setPadding(0,0,0,0);
		chizuru.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				int ran = rnd.nextInt(41);
				SE.play(se,1.0F, 1.0F, 0, 0, 1.0F);
				Toast ts5 = Toast.makeText(KimiBokuAct.this, chi[ran],Toast.LENGTH_LONG);
				ts5.setGravity(Gravity.BOTTOM, 0, 0);
				ts5.show();
			}

		});
		relativeLayout.addView(chizuru,params5);

	}

}
