# AndroidLunchModeTest

This is a simple demo to help you understand Android LunchMode
For more information ， please read this post ：

## Usage
Just modify the intent in StandardActivity

com/example/lunchmodetest/StandardActivity.java

    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(StandardActivity.this,SingleInstanceWithAffinityActivity.class));
            //startActivity(new Intent(StandardActivity.this,SingleInstanceActivity.class));
            //startActivity(new Intent(StandardActivity.this,SingleTaskWithAffinity.class));
            //startActivity(new Intent(StandardActivity.this,SingleTaskActivity.class));
            //startActivity(new Intent(StandardActivity.this,SingleTopActivity.class));
            //startActivity(new Intent(StandardActivity.this,SingleTopWithAffinityActivity.class));
            //startActivity(new Intent(StandardActivity.this,StandardActivity.class));
        }
    });
